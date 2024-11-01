public class Conta {
    private Double saldo;

    public void setSaldo(Double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositarSaldo(Double acrescentar) {
        this.saldo += acrescentar;
    }

    public void sacarSaldo(Double retirar) {
        this.saldo -= retirar;

    }
}
