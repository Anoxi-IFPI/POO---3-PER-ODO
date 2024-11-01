
public class Aluno {
    private String nome = "jose";
    private Double media;
    // atributos media e nome

    public void setNome(String texto) {
        this.nome = texto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMedia(Double valor) {
        this.media = valor;
    }

    public Double getMedia() {
        return this.media;

    }

    public String situacaoAluno() {
        if (this.media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
        // retorna uma String informando se o aluno esta ou nao aprovado
    }

}
