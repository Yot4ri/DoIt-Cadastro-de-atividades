package DoIt.dao;

import DoIt.model.Atividade;
import DoIt.util.DatabaseUtil;
import java.util.List;

public class AtividadeDAOImpl implements AtividadeDAO{

    @Override //Finally sempre é executado, indiferente do resultado de try
    public Atividade getId(int id) {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }
    }

    @Override
    public List<Atividade> getAll() {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }
    }

    @Override
    public boolean criarAtividade(Atividade atividade, Atividade descricao) {
        
        DatabaseUtil.conectar();
        try{
            
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }
    }

    @Override
    public boolean deleteAtividade(Atividade atividade) {
        
        DatabaseUtil.conectar();
        try{
            
        }
        
        finally{
        DatabaseUtil.desconectar();
        }
    }
    
    
    
}
