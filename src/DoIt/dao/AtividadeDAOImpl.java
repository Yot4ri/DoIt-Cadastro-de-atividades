package DoIt.dao;

import DoIt.model.Atividade;
import DoIt.util.DatabaseUtil;
import java.util.List;
import DoIt.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AtividadeDAOImpl implements AtividadeDAO{
    PreparedStatement st;
    final Connection conn = DatabaseUtil.conectar();
    Atividade atividade = null;

    //Bloco de declaração e execução do SQL para Read
    @Override
    public Atividade getId(int id) {
        
        DatabaseUtil.conectar();
        try(conn){
            st = conn.prepareStatement ("SELECT * FROM Atividade");
            ResultSet rs = st.executeQuery();//Armazena o resultado da Query na variável rs
            
            if(rs.next()){ //Verifica se a busca retornou em uma linha válida
                atividade = new Atividade();
                atividade.setId(rs.getInt("Id"));
                atividade.setTitulo(rs.getString("Titulo"));
                atividade.setData(rs.getString("Data"));
                atividade.setDescricao(rs.getString("Descricao"));
            }
            else{
                return null;
            }
            rs.close(); //Finaliza ambos os objetos de forma manual, para que não se fechem apenas quando o sistema for encerrado
            st.close();
        }
        catch(SQLException e){ //Coleta qualquer erro que venha a surgir durante a execução
            System.out.println("Atividade não encontrada! \n" + e.getMessage()); //Informa a mensagem de erro no terminal
            return null;
        }
        
        return atividade;
    }

    //Bloco de declaração e execução do SQL para Read, mas no caso, para a Lista de atividades de determinado usuário, utilizando WHERE
    @Override
    public List<Atividade> getAll() {
        
        try(conn){
            
        }
        catch(SQLException e){
            System.out.println("Atividades não encontradas \n" + e.getMessage());
            return null;
        }
        
    }

    //Bloco de declaração e execução do SQL para Create
    @Override
    public boolean criarAtividade(String atividade, String descricao, String data, int idUsuario) {
        
        try(conn){
            st = conn.prepareStatement("INSERT INTO Atividade(Titulo, Descricao, Data, id_usuario) VALUES (?,?,?,?)");
            st.setString(1, atividade);
            st.setString(2, descricao);
            
            //Esse bloco formata a data de forma a ser aceita pelo SQL, uma vez que não aceita o modelo de entrada, e segue a forma americana yyyy/MM/dd
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate DL = LocalDate.parse(data,formato);
            java.sql.Date sqlData = java.sql.Date.valueOf(DL);
            
            st.setDate(3, sqlData);
            st.setInt(4, idUsuario);
            
            //Executa a atualização e o comando do SQL
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Falha ao criar atividade \n" + e.getMessage());
            return false;
        }
        
        return true;
    }

    //Bloco de declaração e execução do SQL para Delete
    @Override
    public boolean deleteAtividade(int id) {
        
        try(conn){
            st = conn.prepareStatement("DELETE FROM Atividade WHERE id = ?");
            st.setInt(1,id);
            st.executeUpdate();
            
        }
        catch(SQLException e){
            System.out.println("Atividade não encontrada \n" + e.getMessage());
            return false;
        }
        
        return true;
    }
    
    
    
}
