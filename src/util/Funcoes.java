package util;

import biblioteca.mode.Autor;
import biblioteca.mode.Emprestimo;
import biblioteca.mode.Livro;
import biblioteca.mode.Usuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcoes {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void novoLivro() {
        Livro livro = new Livro();
        livros.add(livro);
        livro.setIsbn(JOptionPane.showInputDialog("Digite o ISBN do livro:"));
        livro.setTitulo(JOptionPane.showInputDialog("Digite o título do livro:"));
        Autor autor = new Autor(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do autor:")),
                JOptionPane.showInputDialog("Digite o nome do autor:"));
        autores.add(autor);
        livro.setAutor(autor);
        livro.setExemplaresDisponiveis(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares disponíveis:")));
    }

    public void novoUsuario() {
        Usuario usuario = new Usuario();
        usuarios.add(usuario);
        usuario.setIdUsuario(JOptionPane.showInputDialog("Digite o ID do usuário:"));
        usuario.setNome(JOptionPane.showInputDialog("Digite o nome do usuário:"));
        usuario.setMatricula(JOptionPane.showInputDialog("Digite a matrícula do usuário:"));
    }

    public void novoEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        emprestimos.add(emprestimo);
        emprestimo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do empréstimo:")));
        emprestimo.setLivro(livros.isEmpty() ? null : livros.get(0));
        emprestimo.setUsuario(usuarios.isEmpty() ? null : usuarios.get(0));
        emprestimo.setDataEmprestimo(Calendar.getInstance());
        emprestimo.setDataDevolucaoPrevista(Calendar.getInstance());
    }


    public void listarLivros() {
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
        }
        else {
            String listaLivros = "";
            for (Livro livro : livros) {
                listaLivros += "Título: " + livro.getTitulo() +
                        "\nISBN: " + livro.getIsbn() +
                        "\nAutor: " + livro.getAutor().getNome() +
                        "\nExemplares disponíveis: " + livro.getExemplaresDisponiveis() +
                        "\n\n";
            }
            JOptionPane.showMessageDialog(null, listaLivros, "Lista de Livros", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void listarAutores() {
        if (autores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum autor cadastrado.");
        } else {
            String listaAutores = "";
            for (Autor autor : autores) {
                listaAutores += "ID: " + autor.getAutorId() +
                        "\nNome: " + autor.getNome() +
                        "\n\n";
            }
            JOptionPane.showMessageDialog(null, listaAutores, "Lista de Autores", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
        } else {
            String listaUsuarios = "";
            for (Usuario usuario : usuarios) {
                listaUsuarios += "ID: " + usuario.getIdUsuario() +
                        "\nNome: " + usuario.getNome() +
                        "\nMatrícula: " + usuario.getMatricula() +
                        "\n\n";
            }
            JOptionPane.showMessageDialog(null, listaUsuarios, "Lista de Usuários", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum empréstimo registrado.");
        }
        else {
            String listaEmprestimos = "";
            for (Emprestimo emprestimo : emprestimos) {
                listaEmprestimos += "ID do Empréstimo: " + emprestimo.getId() +
                        "\nLivro: " + (emprestimo.getLivro() != null ? emprestimo.getLivro().getTitulo() : "N/A") +
                        "\nUsuário: " + (emprestimo.getUsuario() != null ? emprestimo.getUsuario().getNome() : "N/A") +
                        "\nData do Empréstimo: " + emprestimo.getDataEmprestimo().getTime() +
                        "\nData de Devolução Prevista: " + emprestimo.getDataDevolucaoPrevista().getTime() +
                        "\n\n";
            }
            JOptionPane.showMessageDialog(null,
                    listaEmprestimos,
                    "Lista de Empréstimos",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void menu() {
        boolean continuar = true;
        while (continuar) {
            String[] opcoes = {"Cadastrar Livro",
                    "Cadastrar Usuário",
                    "Cadastrar Empréstimo",
                    "Listar Livros",
                    "Listar Autores",
                    "Listar Usuários",
                    "Listar Empréstimos",
                    "Sair"};

            int escolha = JOptionPane.showOptionDialog(null,
                    "Escolha uma opção",
                    "Menu Biblioteca",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0:
                    novoLivro();
                    break;
                case 1:
                    novoUsuario();
                    break;
                case 2:
                    novoEmprestimo();
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    listarAutores();
                    break;
                case 5:
                    listarUsuarios();
                    break;
                case 6:
                    listarEmprestimos();
                    break;
                default:
                    continuar = false;
                    break;
            }
        }
    }
}
