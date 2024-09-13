package biblioteca.mode;


public class Autor {
    private int autorId;
    private String nome;

    public Autor() {}

    public Autor(int autorId, String nome) {
        this.autorId = autorId;
        this.nome = nome;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}