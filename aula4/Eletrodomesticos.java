package aula4;

public class Eletrodomesticos {
    private double tensao;
    private double preco;
    private String nome;
    private String cor;

    public Eletrodomesticos(double tensao, double preco, String nome, String cor) {
        this.tensao = tensao;
        this.preco = preco;
        this.nome = nome;
        this.cor = cor;
    }

    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
