public class Aluno {
    private String nome;
    private Double media;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setmedia(Double media) {
        this.media = media;
    }

    public Double getMedia() {
        return this.media;
    }

    public String SituacaoAluno() {
        if (this.media >= 7.0) {
            return "Aprovado";
        }
        if (this.media < 7.0 && this.media >= 4.0) {
            return "prova final";
        }
        return "reprovado";
    }
}
