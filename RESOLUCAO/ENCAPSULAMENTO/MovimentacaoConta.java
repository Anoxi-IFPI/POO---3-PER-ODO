public class MovimentacaoConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setSaldo(1000d);
        c1.depositarSaldo(100d);
        c1.sacarSaldo(50d);

        String msg = "Seu saldo atual eh = " + c1.getSaldo();
        System.out.println(msg);
    }

}
