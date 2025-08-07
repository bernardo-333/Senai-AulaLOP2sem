package banco;

public class Conta {
    private double saldo;

    public double depositar(double deposito) {
        return saldo = saldo + deposito;
    }

    public void sacar(double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("Seu saldo atual é de "+saldo);
            System.out.println();
        } else {
            System.err.println("Saldo insuficiente");
            System.out.println();
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
