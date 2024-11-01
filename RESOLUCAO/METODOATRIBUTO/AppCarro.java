public class AppCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.velocidade = 80;
        System.out.println("velocidade " + c1.acelerar());
        System.out.println("velocidade " + c1.frear());
    }
}
