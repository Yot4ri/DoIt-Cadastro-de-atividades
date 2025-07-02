package DoIt.model;

public class Usuario {
    
    protected Integer id;
    protected String nome, senha, telefone, email;
    
    
    protected Integer getId(){
        return id;
    }
    
    protected void setId(Integer id){
        this.id=id;
    }
    
    protected String getNome(){
        return nome;
    }
    
    protected void setNome(String nome){
        this.nome = nome;
    }
    
    protected String getTelefone(){
        return telefone;
    }
    
    protected void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    protected String getEmail(){
        return email;
    }
    
    protected void setEmail(String email){
        this.email = email;
    }
}
