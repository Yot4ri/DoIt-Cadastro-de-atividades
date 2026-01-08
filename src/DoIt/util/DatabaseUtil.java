package DoIt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil{
    
    private static String url = "jdbc:mysql://localhost:3306/doIt";//Caminho do DB
    private static String usuario = "root";
    private static String senha = "";//Valor da senha
    
    public static Connection conectar(){ //Cria a conexão com o DB
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url,usuario,senha);
            
            return conexao;
        } 
        
        //No caso de algum erro, retorna nulo
        catch(ClassNotFoundException e){//Caso não encontre o Drive
        System.out.println("Driver não encontrado: " + e.getMessage());
        return null;
        } 
        catch(SQLException e){//Erro no endereço da conexão
        System.out.println("Erro ao conectar: " + e.getMessage());
        return null;
        }
    }
    
    public static Connection desconectar(){
        try{
            Connection conexao = DriverManager.getConnection(url,usuario,senha);
            conexao.close();
            return null;
        }
        
        catch(SQLException e){
            System.out.println("Erro ao desconectar: " + e.getMessage());
            return null;
        }
    }
}
