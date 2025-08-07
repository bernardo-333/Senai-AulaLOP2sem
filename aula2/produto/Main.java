package produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome e o preço do produto");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto pd = new Produto(nome, preco);


        System.out.println("digite quantos porcento você quer de desconto?");
        System.out.print("desconto em porcentagem: ");
        double desconto = sc.nextDouble();
        desconto = desconto / 100;
        System.out.println("\nNome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Desconto do produto: " + desconto);
        System.out.println("Seu preço atual é de R$"+pd.aplicarDesconto(desconto));


    }
}
