import javax.swing.JOptionPane;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "antonio";
        f1.matricula = "lcom0011";
        f1.salario = 1412.0;
        String msg = "nome: " + f1.nome + "\n" + "matricula: " + f1.matricula + "\n" + "salario :" + f1.salario;
        JOptionPane.showMessageDialog(null, msg);
    }

}
