public class Aluno2 {
    private double qualitativo = 2;
    private double media = 0;
    private int falta = 0;

    public void setQualitativo(double valor) {
        this.qualitativo = valor;
    }

    public double getQualitativo() {
        return qualitativo;
    }

    public void setMedia(double valor) {
        this.media = valor;
    }

    public double getMedia() {
        return media;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public int getFalta() {
        return falta;
    }

    public void acrescentarFaltas(double acrescimo) {
        falta += acrescimo;
        qualitativo -= (falta * 0.1);
    }

    public String calcularSitacao() {
        if (falta <= 10 && (media + qualitativo) >= 7.0) {
            return ("aprovado");
        } else {
            return ("reprovado");
        }

    }
}
