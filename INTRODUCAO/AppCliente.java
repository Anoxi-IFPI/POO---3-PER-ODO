import javax.swing.JOptionPane;

public class AppCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "jose";
        c1.cpf = "110.672.983 - 53";
        c1.codigo = "A2W4E";
        String msg = "nome: " + c1.nome + "\n" +
                "cpf: " + c1.cpf + "\n" + "codigo: " + c1.codigo;
        JOptionPane.showMessageDialog(null, msg);
    }

}
