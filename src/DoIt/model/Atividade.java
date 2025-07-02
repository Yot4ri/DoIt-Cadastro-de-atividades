package DoIt.model;

public class Atividade {
    
    protected Integer id;
    protected String titulo, descricao, data;
    
    protected Integer getId(){
        return id;
    }
    
    protected void setId(Integer id){
        this.id = id;
    }
    
    protected String getTitulo(){
        return titulo;
    }
    
    protected void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    protected String getDescricao(){
        return descricao;
    }
    
    protected void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    protected String getData(){
        return data;
    }
    
    protected void setData(String data){
        this.data = data;
    }
}
