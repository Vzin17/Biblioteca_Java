package biblioteca.mode;

import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nome;
    private String matricula;
    private List<Emprestimo> emprestimos;

    public Usuario() {}

    public Usuario(String idUsuario, String nome, String matricula) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}