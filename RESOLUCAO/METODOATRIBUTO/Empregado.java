public class Empregado {
    public int hrTrabalhadas;

    public int adicionarHoras(int horas) {
        hrTrabalhadas += horas;
        return hrTrabalhadas;
    }

    public Double calcularsalario() {
        hrTrabalhadas *= 70.5;
        return (double) hrTrabalhadas;

    }

}
