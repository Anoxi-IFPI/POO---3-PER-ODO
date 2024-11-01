public class ObjAluno02 {
    public static void main(String[] args) {
        Aluno2 a2 = new Aluno2();
        a2.setFaltas(2);
        a2.setMedia(7d);

        System.out.println(a2.calcularSituação());
        System.out.println(a2.notaAluno());
    }

}
