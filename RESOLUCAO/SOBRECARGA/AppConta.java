import javax.swing.JOptionPane;

public class AppConta {
    public static void main(String[] args) {
        Conta a = new Conta("2345-16");
        Conta b = new Conta("2093-21", 100d);
        b.depositarValor(100d);
        JOptionPane.showMessageDialog(null, "conta A: " + a.getSaldo());
        JOptionPane.showMessageDialog(null, "conta B: " + b.getSaldo());
    }

}
