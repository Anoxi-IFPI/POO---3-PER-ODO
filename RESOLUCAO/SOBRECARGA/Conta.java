public class Conta {
    private String numero;
    private Double saldo;

    public Conta(String numero) {
        this.numero = numero;
    }

    public Conta(String numero, Double valor) {
        this.saldo = valor;
        this.numero = numero;
    }

    public void depositarValor(Double deposito) {
        this.saldo += deposito;
    }

    public void sacarValor(Double saque) {
        this.saldo -= saque;
    }

    public Double getSaldo() {
        return this.saldo;
    }

}
