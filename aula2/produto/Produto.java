package produto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public double aplicarDesconto(double desconto) {
        double base = desconto * preco;
        preco = preco - base;
        return preco;
    }
}
