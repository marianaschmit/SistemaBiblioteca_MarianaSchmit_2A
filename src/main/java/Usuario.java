
public class Usuario {
    //atributos

    private int id;
    private String nome;
    private String email;

    //construtor
    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
    //método getter 
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    //método setter
    public void setId(int novoId){
        this.id = novoId;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }
}
