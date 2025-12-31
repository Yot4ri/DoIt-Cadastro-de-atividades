package DoIt.dao;

import DoIt.model.Atividade;
import java.util.List;

public interface AtividadeDAO {
    
    Atividade getId(int id);
    List<Atividade> getAll();
    boolean criarAtividade(Atividade atividade, Atividade descricao);
    boolean deleteAtividade(Atividade atividade);
}
