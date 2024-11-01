public class AppEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        e1.hrTrabalhadas = 0;
        e1.adicionarHoras(10);
        System.out.println("quantidade de horas trabalhadas " +
                "\n" + "horas = " + e1.hrTrabalhadas);

        System.out.print("salario = " + e1.calcularsalario());
    }

}
