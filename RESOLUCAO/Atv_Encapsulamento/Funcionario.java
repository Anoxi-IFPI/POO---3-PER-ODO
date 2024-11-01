public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String texto) {
        this.nome = texto;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double valor) {
        this.salario = valor;
    }

    public double getSalario() {
        return this.salario;
    }

    public Double impostoRenda() {
        return this.salario * 0.15d;
    }

    public double inss() {
        return this.salario * 0.10;
    }

    public double salarioFinal() {
        return salario - (impostoRenda() + inss());

    }

}
