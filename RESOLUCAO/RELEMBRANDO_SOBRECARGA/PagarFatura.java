import javax.swing.JOptionPane;

public class PagarFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();
        Fatura f2 = new Fatura("123", "mouse");
        Fatura f3 = new Fatura("170", "teclado", 2, 70.0);

        f1.setNumero("346");
        f1.setDescricao("SSD");
        f1.setPreco(90d);
        f1.setQuantidade(2);

        f2.setPreco(60d);
        f2.setQuantidade(3);

        String fatura = "----------------------------------------------" + "\n" +
                "--- FATURA DE MERCADORIA ---" + "\n" +
                "----------------------------------------------" + "\n" + "\n" +
                "--- Numero: " + f1.getNumero() + "\n" + "\n" +
                "--- Descricao: " + f1.getDescricao() + "\n" + "\n" +
                "--- Preco: " + f1.getPreco() + " R$" + "\n" + "\n" +
                "--- Quantidade: " + f1.getQuantidade() + "\n" + "\n" +
                "--- Total a Pagar: " + f1.getFAtura() + " R$" + "\n" +
                "----------------------------------------------";

        String fatura2 = "----------------------------------------------" + "\n" +
                "--- FATURA DE MERCADORIA ---" + "\n" +
                "----------------------------------------------" + "\n" + "\n" +
                "--- Numero: " + f2.getNumero() + "\n" + "\n" +
                "--- Descricao: " + f2.getDescricao() + "\n" + "\n" +
                "--- Preco: " + f2.getPreco() + " R$" + "\n" + "\n" +
                "--- Quantidade: " + f2.getQuantidade() + "\n" + "\n" +
                "--- Total a Pagar: " + f2.getFAtura() + " R$" + "\n" +
                "----------------------------------------------";

        String fatura3 = "----------------------------------------------" + "\n" +
                "--- FATURA DE MERCADORIA ---" + "\n" +
                "----------------------------------------------" + "\n" + "\n" +
                "--- Numero: " + f3.getNumero() + "\n" + "\n" +
                "--- Descricao: " + f3.getDescricao() + "\n" + "\n" +
                "--- Preco: " + f3.getPreco() + " R$" + "\n" + "\n" +
                "--- Quantidade: " + f3.getQuantidade() + "\n" + "\n" +
                "--- Total a Pagar: " + f3.getFAtura() + " R$" + "\n" +
                "----------------------------------------------";

        JOptionPane.showMessageDialog(null, fatura, "FATURA", 0);
        JOptionPane.showMessageDialog(null, fatura2, "FATURA", 0);
        JOptionPane.showMessageDialog(null, fatura3, "FATURA", 0);

    }
}
