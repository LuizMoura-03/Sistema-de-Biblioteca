package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Sistema de Biblioteca");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuario");
            System.out.println("3. Listar Livros");
            System.out.println("4. Listar usuarios");
            System.out.println("5. Sari");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o titulo do Livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ISBN do Livro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.cadastrarLivro(new Livro(titulo, autor, isbn));
                }
                case 2 -> {
                    System.out.println("Digite o nome do usuario: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o ID do usuario: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(nome, id));
                }
                case 3 -> biblioteca.listarLivros();
                case 4 -> biblioteca.listarusuarios();
                case 5 -> {
                    System.out.println("saindo do sistema ... ");
                    return;
                }
                default -> System.out.println("Opção invalida. Tente novamente. ");
            }
        }
    }
}