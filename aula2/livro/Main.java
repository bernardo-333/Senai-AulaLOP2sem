package livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Ola bem vindo ao cadastro de livros---");
        System.out.print("\nNome do livro: ");
        String nome = sc.nextLine();
        System.out.print("Nome do autor: ");
        String autor = sc.nextLine();
        System.out.print("Numero de páginas: ");
        int numPaginas = sc.nextInt();

        Livro lv = new Livro(nome, autor);

        System.out.println();
        lv.setNumPaginas(numPaginas);
    }
}
