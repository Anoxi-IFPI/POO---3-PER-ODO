import javax.swing.JOptionPane;

public class AppData {
    public static void main(String[] args) {
        Data a = new Data();
        Data b = new Data(1);
        Data c = new Data(7, 05);
        Data d = new Data(20, 10, 2050);

        String msg = a.retornarData() + "\n" +
                b.retornarData() + "\n" +
                c.retornarData() + "\n" +
                d.retornarData() + "\n";

        String msg2 = a.quantidadeDias() + "\n" +
                b.quantidadeDias() + "\n" +
                c.quantidadeDias() + "\n" +
                d.quantidadeDias();

        System.out.println(msg + "\n" + msg2);

    }
}
