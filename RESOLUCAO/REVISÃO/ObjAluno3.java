public class ObjAluno3 {
    public static void main(String args[]) {
        Aluno3 a = new Aluno3();
        Aluno3 b = new Aluno3("14INF321");
        a.registarFalta();
        a.registarFalta();
        System.out.println(a.getQualitativo());
        System.out.println(b.getQualitativo());
    }
}
