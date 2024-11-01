public class ObjRefeitorio {
    public static void main(String[] args) {
        AlunoRefeitorio a = new AlunoRefeitorio("2023.lcom");
        AlunoRefeitorio b = new AlunoRefeitorio("2024.kln");
        AlunoRefeitorio c = new AlunoRefeitorio("2023.c#");
        AlunoRefeitorio d = new AlunoRefeitorio("2024.c++");

        a.SaldoAluno(50);
        b.SaldoAluno(10);
        c.SaldoAluno(0);
        d.SaldoAluno(5);

        String msg = a.getMatricula() + ": " + a.getSaldoCarteitinha() + "R$" + "\n" +
                b.getMatricula() + ": " + b.getSaldoCarteitinha() + "R$" + "\n" +
                c.getMatricula() + ": " + c.getSaldoCarteitinha() + "R$" + "\n" +
                d.getMatricula() + ": " + d.getSaldoCarteitinha() + "R$" + "\n";

        String msg2 = (a.refeitorio()) + "\n" +
                (b.refeitorio()) + "\n" +
                (c.refeitorio()) + "\n" +
                (d.refeitorio());

        System.out.print(msg + "\n" + msg2);

    }

}
