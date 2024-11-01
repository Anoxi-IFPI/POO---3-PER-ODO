public class Aluno {
    private String nome;
    private Double media;

    public void setNome(String valor) {
        this.nome = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMedia(Double valor) {
        this.media = valor;
    }

    public double getMedia() {
        return this.media;
    }

    public String situacaoAluno() {
        if (this.media >= 7.0) {
            return ("aprovado");
        } else {
            return ("reprovado");
        }
    }

}