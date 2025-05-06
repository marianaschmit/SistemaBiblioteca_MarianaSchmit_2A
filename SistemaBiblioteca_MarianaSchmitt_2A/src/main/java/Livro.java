public class Livro {
    //atributos
    private static int proximoIsbn = 1;
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;

    //construtor
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn =proximoIsbn++;
    }

    //método getter
    public String getTitulo(){
        return this.titulo;
    }
}
