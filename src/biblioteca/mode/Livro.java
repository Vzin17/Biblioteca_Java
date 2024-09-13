package biblioteca.mode;

public class Livro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int exemplaresDisponiveis;

    public Livro() {}

    public Livro(String isbn, String titulo, Autor autor, int exemplaresDisponiveis) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
}