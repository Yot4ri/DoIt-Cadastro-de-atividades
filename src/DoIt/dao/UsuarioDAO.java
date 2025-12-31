package DoIt.dao;

import DoIt.model.Usuario;

public interface UsuarioDAO {
    
    Usuario getId(int id);
    boolean criarUsuario(Usuario usuario, Usuario senha);
    boolean verificarUsuario(Usuario usuario, Usuario senha);
}
