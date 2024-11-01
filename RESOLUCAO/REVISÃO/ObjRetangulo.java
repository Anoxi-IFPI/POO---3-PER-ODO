import javax.swing.JOptionPane;

public class ObjRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(10d, 9.0d);
        r1.setBase(10d);
        r1.setAltura(10d);

        String msg = "Base " + r1.getBase() + "\n" +
                "altura " + r1.getAltura() + "\n" +
                "area " + r1.calcularArea();

        JOptionPane.showMessageDialog(null, msg);

    }

}
