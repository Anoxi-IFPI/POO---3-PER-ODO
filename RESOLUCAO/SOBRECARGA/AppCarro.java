public class AppCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        Carro b = new Carro();
        a.IncrementarAceleração(10);
        b.AcelerarCarro(10);
        String msg = "Carro 1 = " + a.getVelocidade() + "\n" +
                "Carro 2 = " + b.getVelocidade();

        System.out.print(msg);

    }
}
