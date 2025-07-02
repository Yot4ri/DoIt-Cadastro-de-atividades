package DoIt.model;

public class Configuracoes {
    
    protected Integer id, tamanhoFonte;
    protected String tema;
    
    protected Integer getId(){
        return id;
    }
    
    protected void setId(Integer id){
        this.id = id;
    }
    
    protected Integer getTamanhoFonte(){
        return tamanhoFonte;
    }
    
    protected void setTamanhoFonte(Integer tamanhoFonte){
        this.tamanhoFonte = tamanhoFonte;
    }
    
    protected String getTema(){
        return tema;
    }
    
    protected void setTema(String tema){
        this.tema = tema;
    }
}
