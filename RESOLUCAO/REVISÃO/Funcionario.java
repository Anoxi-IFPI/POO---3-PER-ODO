public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularIR() {
        return this.salario * 0.15;
    }

    public Double calcularINSS() {
        return this.salario * 0.10;
    }

    public Double salarioFinal() {
        return this.salario - (calcularIR() + calcularINSS());
    }

}
