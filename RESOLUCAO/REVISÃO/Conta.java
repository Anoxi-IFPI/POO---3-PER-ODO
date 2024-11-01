public class Conta {
    private double saldo;

    Conta() {
        saldo = 500;
    }

    Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    void deposito(double valor) {
        saldo = saldo + valor;
    }

    void saque(double valor) {
        saldo = saldo - valor;
    }

    double getSaldo() {
        return saldo;
    }
}