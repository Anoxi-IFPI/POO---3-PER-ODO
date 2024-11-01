import javax.swing.JOptionPane;

public class ObjetoAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno("as234");
        a.adicionarNota(5);
        a.adicionarNota(4);
        a.adicionarNota(9);
        JOptionPane.showMessageDialog(null, a.getNotas(), null, 0);
    }
}
