import javax.swing.JOptionPane;

public class AppAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "antonio";
        a1.nota1 = 6.75;
        a1.nota2 = 9.7;
        a1.nota3 = 8;
        String msg = "Aluno " + a1.nome + "\n" + "nota1 = " + a1.nota1 + "\n" + "nota2 = " + a1.nota2
                + "\n" + "nota3 = " + a1.nota3;
        JOptionPane.showMessageDialog(null, msg);
    }

}
