import javax.swing.JOptionPane;

public class ObjAluno2 {
    public static void main(String[] args) {
        Aluno2 a2 = new Aluno2();
        a2.setFalta(2);
        a2.setMedia(9);
        a2.acrescentarFaltas(3);
        String msg = "media: " + a2.getMedia() + "\n" +
                "Faltas: " + a2.getFalta() + "\n" +
                "Qualitativo: " + a2.getQualitativo() + "\n" +
                "Situacao: " + a2.calcularSitacao();

        JOptionPane.showMessageDialog(null, msg, "SITUACAO ALUNO", 3);
    }

}
