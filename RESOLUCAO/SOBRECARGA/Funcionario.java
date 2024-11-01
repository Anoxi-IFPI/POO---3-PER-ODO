public class Funcionario {
    private String matricula;
    private int totalHrMes;

    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public String getMInhaMatricula() {
        return this.matricula;
    }

    public void setHorasTrabalhoTotais(int horasTotais) {
        this.totalHrMes = horasTotais;
    }

    public void SetRegistrarHr(int hrEntrada, int hrSaida) {
        totalHrMes = hrSaida - hrEntrada;
    }

    public int getHorasTrabalhadas() {
        return this.totalHrMes;
    }

}
