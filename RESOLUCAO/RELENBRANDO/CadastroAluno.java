public class CadastroAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno("antonio", "2023112LCOM0011", 2);
        Aluno b = new Aluno("julio", "2023112LCOM0005", 8.0, 5);
        Aluno c = new Aluno("luiz", "2023112LCOM1005", 9.0, "segundo A", 15);

        a.informarMedia(9.0);
        b.getMedia();
        c.getMedia();

        String msg = "aluno " + a.getNome() + " com media parcial = " + a.getMedia() + "\n" +
                "aluno " + b.getNome() + " com media parcial = " + b.getMedia() + "\n" +
                "aluno " + c.getNome() + " com media parcial = " + c.getMedia() + "\n";

        String msg2 = "aluno " + a.getNome() + " com media definitiva = " + a.mediaFinal() + "\n" +
                "aluno " + b.getNome() + " com media definitiva = " + b.mediaFinal() + "\n" +
                "aluno " + c.getNome() + " com media definitiva = " + c.mediaFinal();

        System.out.print(msg);
        System.out.print(msg2);

        System.out.print(a.mediaFinal());

    }

}
