import javax.swing.JOptionPane;

public class ObjAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("antonio");
        a1.setNome("antonio");
        a1.setmedia(10.0D);
        a1.SituacaoAluno();
        String msg = "nome: " + a1.getNome() + "\n" +
                "media: " + a1.getMedia() + "\n" +
                "Situação " + a1.SituacaoAluno();

        JOptionPane.showMessageDialog(null, msg);

    }
}
