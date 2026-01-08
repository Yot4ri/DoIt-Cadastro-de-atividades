package DoIt.dao;

import DoIt.model.Atividade;
import java.util.List;

public interface AtividadeDAO {
    
    Atividade getId(int id);
    List<Atividade> getAll();
    boolean criarAtividade(String atividade, String descricao, String data, int idUsuario);
    boolean deleteAtividade(int id);
}
