public class Aluno3 {
    private String matricula;
    private double qualitativo;

    public Aluno3() {
        this("00INF000");
    }

    public Aluno3(String matricula) {
        this.matricula = matricula;
        qualitativo = 2.0;
    }

    public void registarFalta() {
        qualitativo -= 0.1;
    }

    public double getQualitativo() {
        return qualitativo;
    }

    public String getMatricula() {
        return matricula;
    }
}
