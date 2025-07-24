package DoIt.model;

import java.util.List;
import java.util.ArrayList;

public class ListaAtividade {
    
    private static final List<Atividade> lista = new ArrayList<>();
    
    public static List<Atividade> Listar() {
        return lista;
    }
    
    public static void Adicionar (Atividade atividade) {
        lista.add(atividade);
    }
}
