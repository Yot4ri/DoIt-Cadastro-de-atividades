package DoIt.dao;

import DoIt.model.Usuario;
import DoIt.util.DatabaseUtil;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAOImpl implements UsuarioDAO{
    PreparedStatement st;
    final Connection conn = DatabaseUtil.conectar();
    Usuario usuario = null;

    @Override //Finally sempre é executado, indiferente do resultado de try
    public Usuario getId(int id) {
        
        //Declaração de variáveis
        
        //Bloco de declaração e execução do SQL para Read
        try(conn){
            st = conn.prepareStatement("SELECT * FROM Usuario");
            ResultSet rs = st.executeQuery(); //Armazena o resultado da Query na variável resultado
        
            if(rs.next()){ //Verifica se resultou em alguma linha afetada
                usuario = new Usuario();
                usuario.setId(rs.getInt("Id"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setSenha(rs.getString("Senha"));
            }
            else{
                return null;
            }
            rs.close();
            st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        /*
        finally{
        DatabaseUtil.desconectar();    
        }
        
        */
        return usuario;
    }

    @Override
    public boolean criarUsuario(String nome, String email, String senha) {
       
        try(conn){
            st = conn.prepareStatement("INSERT INTO Usuario (Nome, Email, Senha) VALUES (?,?,?)");
            st.setString(1, nome);
            st.setString(2, email);
            st.setString(3, senha);
            st.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }

    @Override
    public boolean verificarUsuario(String email, String senha) {
        
        try(conn){
            st = conn.prepareStatement("Select * from Usuario WHERE Email = ? AND Senha = ?");
            st.setString(1, email);
            st.setString(2, senha);
            ResultSet rs = st.executeQuery(); //Armazena o resultado da Query na variável resultado

        if(rs.next()){ //Verifica se resultou em alguma linha afetada
                usuario = new Usuario();
                usuario.setId(rs.getInt("Id"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setSenha(rs.getString("Senha"));
            }
            else{
                return false;
            }
            rs.close();
            st.close();
        }
        catch(SQLException e){
            System.out.println("Usuário não encontrado" + e.getMessage());
            return false;
        }   
        
        return true;
    }
   
}
