public class Aluno {
    private String nome;
    private String matricula;
    private Double media;
    private String turma;
    private Double qualitativo;
    private int falta;

    public Aluno(String nome, String matricula, int falta) {
        this.nome = nome;
        this.qualitativo = 2.0;
        this.media = 0.0;
        this.turma = "Turma A";
        this.matricula = matricula;
        this.falta = falta;
    }

    public Aluno(String nome, String matricula, Double media, int falta) {
        this.nome = nome;
        this.media = media;
        this.turma = "Turma B";
        this.matricula = matricula;
        this.falta = falta;
    }

    public Aluno(String nome, String matricula, Double media, String turma, int falta) {
        this.nome = nome;
        this.media = media;
        this.qualitativo = 2.0;
        this.turma = turma;
        this.matricula = matricula;
        this.falta = falta;
    }

    public String getNome() {
        return this.nome;
    }

    public int getFalta() {
        return falta;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getQualitativo() {
        return qualitativo;
    }

    public String getTurma() {
        return turma;
    }

    public void informarMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return this.media;
    }

    public Double mediaFinal() {
        return this.media + (this.qualitativo - (this.falta * 0.1));

    }

    public String situaçãoAluno() {
        if (mediaFinal() >= 7.0) {
            return "Aluno " + this.nome + "aprovado com media = " + mediaFinal();
        }
        if (mediaFinal() < 7.0 && mediaFinal() >= 4) {
            return "Aluno " + this.nome + "prova final com media = " + mediaFinal();
        }
        return "Reprovado";

    }

}