package aula4;

public class Microondas extends Eletrodomesticos{
    private double capacidade;

    public Microondas(double tensao, double preco, String nome, String cor, double capacidade) {
        super(tensao, preco, nome, cor);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "capacidade=" + capacidade +
                '}';
    }
}
