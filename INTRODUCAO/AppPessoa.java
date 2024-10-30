import javax.swing.JOptionPane;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "daniel jatoba";
        p1.idade = 18;
        JOptionPane.showMessageDialog(null, "nome: " + "\n" + p1.nome +
                "\n" + "idade" + p1.idade);
    }
}