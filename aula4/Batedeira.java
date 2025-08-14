package aula4;

public class Batedeira extends Eletrodomesticos{
    private double potencia;

    public Batedeira(double tensao, double preco, String nome, String cor, double potencia) {
        super(tensao, preco, nome, cor);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
