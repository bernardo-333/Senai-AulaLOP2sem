package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta ct = new Conta();

        while (true) {
            System.out.println("-----Bem vindo a sua Conta-----");
            System.out.println("\nEscolha:");
            System.out.println("1- Consultar seu saldo");
            System.out.println("2- Realizar um saque");
            System.out.println("3- Realizar um deposito");
            System.out.print("\n> ");
            int escolha = sc.nextInt();


            if (escolha == 1) {
                System.out.println("\n---Você escolheu para consultar seu saldo---");
                System.out.println("Seu saldo é de R$" + ct.getSaldo());
                System.out.println();
            } else if (escolha == 2) {
                System.out.println("\n---Você escolheu para realizar um saque---");
                System.out.println("Escolha o valor do seu saque");
                System.out.print("> R$");
                double saque = sc.nextDouble();
                ct.sacar(saque);
            } else if (escolha == 3) {
                System.out.println("\n---Você escolheu para realizar um deposito---");
                System.out.println("Escolha o valor do seu deposito");
                System.out.print("> R$");
                double deposito = sc.nextDouble();
                ct.depositar(deposito);
                System.out.println("Depositado realizado com sucesso!");
                System.out.println();
            } else {
                System.err.println("Escolha uma opção valida");
                System.out.println();
            }
        }
    }
}
