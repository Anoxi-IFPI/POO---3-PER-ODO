public class ObjFuncionario {
    public static void main(String[] args) {
        Funcionario a = new Funcionario("2021Java.A.sousa.Junior");
        Funcionario b = new Funcionario("2023.Python.D.jatoba.Junior");
        a.SetRegistrarHr(13, 17);
        b.setHorasTrabalhoTotais(4);
        String msg = "Matricula: " + (a.getMInhaMatricula() + "\n" +
                "Horas trabalhadas " + a.getHorasTrabalhadas()) + "\n" + "\n" +
                "Matricula " + b.getMInhaMatricula() + "\n" +
                "Horas trabalhadas " + b.getHorasTrabalhadas();

        System.out.print(msg);
    }

}
