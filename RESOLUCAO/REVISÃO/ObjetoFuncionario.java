import javax.swing.JOptionPane;

public class ObjetoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("antonio", 1000d);
        f1.calcularINSS();
        f1.calcularIR();
        String msg = "IMPOSTOS " + "\n" +
                "INSS = " + f1.calcularINSS() + "\n" +
                "IR DE RENDA = " + f1.calcularIR() + "\n" +
                "Salario final" + f1.salarioFinal();
        JOptionPane.showMessageDialog(null, msg);

    }
}
