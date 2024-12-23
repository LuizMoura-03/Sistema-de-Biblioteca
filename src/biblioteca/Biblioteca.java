package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usario cadastrado com sucesso!");
    }

    public void listarLivros() {
        System.out.println("Lista de Livros");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }

}
