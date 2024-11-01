public class Aluno2 {
    private Double qualitativo, media;
    private int faltas;

    public Aluno2() {
        this.qualitativo = 2.0;
        this.media = 0d;
        this.faltas = 0;
    }

    public void setQualitativo(Double qualitativo) {
        this.qualitativo = qualitativo;
    }

    public Double getQualitativo() {
        return qualitativo;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

    public void adicionarFaltas(Double totalFaltas) {
        this.faltas += totalFaltas;

    }

    public Double notaAluno() {
        Double mediaFinal = this.media += this.qualitativo;
        return mediaFinal - (this.faltas *= 0.1d);
    }

    public String calcularSituação() {
        if (this.media >= 7d && this.faltas <= 10) {
            return "aprovado";
        }
        if (this.media < 7 && this.faltas > 10) {
            return "recuperação";
        }
        return "reprovado";
    }

}
