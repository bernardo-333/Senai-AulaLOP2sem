package pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa ps  = new Pessoa();
        System.out.println("Ola digite seu nome e idade");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        ps.setNome(nome);
        while (true) {
        System.out.print("idade: ");
        int idade = sc.nextInt();

            if (idade > 0) {
                ps.setIdade(idade);
                break;
            } else {
                System.out.println("Digite uma idade valida");
                System.out.println();
            }
        }

        ps.apresentar();

    }
}
