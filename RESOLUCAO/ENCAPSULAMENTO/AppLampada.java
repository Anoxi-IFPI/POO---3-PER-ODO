public class AppLampada {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.setEstado(false);
        l1.acenderLampada();
        System.out.println("acender " + l1.getEstado());

        l1.apagarLampada();
        System.out.println("apagar " + l1.getEstado());

    }

}
