package DoIt.dao;

import DoIt.model.Atividade;
import java.util.List;

public interface AtividadeDAO {
    
    Atividade getId(int id);
    List<Atividade> listarPorUsuario(int idUsuario);
    boolean criarAtividade(String atividade, String descricao, String data, int idUsuario);
    boolean deleteAtividade(int id);
    boolean atualizarRealizado(int id, boolean realizado);
}
