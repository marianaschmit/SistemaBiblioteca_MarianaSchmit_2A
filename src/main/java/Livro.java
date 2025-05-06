
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
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public int getIsbn(){
        return this.isbn;
    }
    
    //método setter
}
