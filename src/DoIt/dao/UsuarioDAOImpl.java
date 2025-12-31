package DoIt.dao;

import DoIt.model.Usuario;
import DoIt.util.DatabaseUtil;

public class UsuarioDAOImpl implements UsuarioDAO{

    @Override //Finally sempre é executado, indiferente do resultado de try
    public Usuario getId(int id) {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();    
        }
    }

    @Override
    public boolean criarUsuario(Usuario usuario, Usuario senha) {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }
    }

    @Override
    public boolean verificarUsuario(Usuario usuario, Usuario senha) {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }    
    }
   
}
