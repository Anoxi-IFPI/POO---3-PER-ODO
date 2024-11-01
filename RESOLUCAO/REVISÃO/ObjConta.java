public class ObjConta {
    public static void main(String string[]) {
        Conta conta = new Conta();
        Conta conta2 = new Conta(100);
        conta.deposito(100);
        conta2.deposito(100);

        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
