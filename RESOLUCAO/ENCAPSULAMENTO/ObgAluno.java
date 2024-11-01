
public class ObgAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("antonio");
        System.out.println("nome " + a1.getNome());

        a1.setMedia(10.0);
        System.out.println(a1.getMedia());

        System.out.print(a1.situacaoAluno());

    }

}
