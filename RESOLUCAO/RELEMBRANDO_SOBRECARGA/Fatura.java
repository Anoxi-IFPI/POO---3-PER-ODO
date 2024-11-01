public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Fatura(String numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = 0;
        this.preco = 0.0;
    }

    public Fatura() {
        this.quantidade = 0;
        this.preco = 0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPreco(Double preco) {
        this.preco += preco;
    }

    public Double getPreco() {
        return this.preco;
    }

    public Double getFAtura() {
        if (this.quantidade == 0) {
            this.preco = 0;
            Double valor = this.preco *= this.quantidade;
            return valor;
        } else {
            return this.preco *= this.quantidade;
        }
    }

}