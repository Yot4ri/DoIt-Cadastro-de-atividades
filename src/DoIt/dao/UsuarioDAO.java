package DoIt.dao;

import DoIt.model.Usuario;

public interface UsuarioDAO {
    
    Usuario getId(int id);
    boolean criarUsuario(String nome, String email, String senha);
    boolean verificarUsuario(String email, String senha);
}
