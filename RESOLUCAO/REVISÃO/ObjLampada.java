import javax.swing.JOptionPane;

public class ObjLampada {
    public static void main(String[] args) {
        Lampada l1 = new Lampada(true);
        l1.acenderLampada();
        l1.apagarLampada();
        String msg = "Lampada acesa = " + l1.getEstado();
        JOptionPane.showMessageDialog(null, msg);
    }

}
