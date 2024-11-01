import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JOptionPane;

public class ObjLampada {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.acender();
        l1.apagar();

        JOptionPane.showMessageDialog(null, "Ligada = " + l1.getEstado(), "Lampada 💡", 3);
    }

}
