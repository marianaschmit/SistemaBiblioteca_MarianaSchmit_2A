
public class Livro {
//atributos

    private static int proximoIsbn = 1;
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;

//construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = proximoIsbn++;
    }

//método getter (usado para acessar o valor do atributo privado da classe
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int getIsbn() {
        return isbn;
    }

    //método setter 
    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }
    
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    
    public void setAno(int novoAno){
        this.ano = novoAno;
    }
    
    public void setIsbn(int novoIsbn){
        this.isbn = novoIsbn;
    }
}
