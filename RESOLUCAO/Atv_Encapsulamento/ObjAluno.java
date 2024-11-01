import javax.swing.JOptionPane;

public class ObjAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Antonio");
        a1.setMedia(8d);

        String msg = "Aluno " + "\n" +
                "Nome: " + a1.getNome() + "\n" +
                "Situacao: " + a1.situacaoAluno();

        JOptionPane.showMessageDialog(null, msg, "Aluno 🧑‍🎓 ", 2);

    }

}
