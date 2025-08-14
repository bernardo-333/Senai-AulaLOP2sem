package aula4;

public class Contador extends Funcionario{
    public Contador(String nome, double salario, String rg, int numCrc) {
        super(nome, salario, rg);
        this.numCrc = numCrc;
    }
    private int numCrc;

    public int getNumCrc() {
        return numCrc;
    }

    public void setNumCrc(int numCrc) {
        this.numCrc = numCrc;
    }
}
