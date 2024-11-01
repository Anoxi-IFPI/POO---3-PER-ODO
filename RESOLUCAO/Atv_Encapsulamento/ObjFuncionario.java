import javax.swing.JOptionPane;

public class ObjFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("antonio");
        f1.setSalario(1500);
        String name = "Funcionario  " + f1.getNome();
        String Salario = "Salario = " + f1.getSalario();
        String imposto = "Imposto = " + f1.impostoRenda();
        String inss = "inss = " + f1.inss();
        String salarioFinal = "Salario Final = " + f1.salarioFinal();

        JOptionPane.showMessageDialog(null, name + "\n"
                + Salario + "\n"
                + imposto + "\n"
                + inss + "\n" +
                salarioFinal, "FUNCIONARIO", 2);

    }

}
