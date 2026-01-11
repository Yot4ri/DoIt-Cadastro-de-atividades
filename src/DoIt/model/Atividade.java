package DoIt.model;

public class Atividade {
    
    protected Integer id;
    protected String titulo, descricao, data;
    protected boolean realizado;
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public boolean getRealizado(){
        return realizado;
    }
    
    public void setRealizado(boolean realizado){
    this.realizado = realizado;
    }
}
