import javax.swing.JOptionPane;

public class AreaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setBase(10d);
        r1.setAltuea(20d);

        String medidas = "Medidas = " +
                "Base " + r1.getBase() +
                " x " + "Altura " + r1.getaltura();

        String msg = "AREA DO RETANGULO = "
                + r1.calcularArea();

        JOptionPane.showMessageDialog(null, medidas + "\n" + msg, "AREA", 2);
    }

}
