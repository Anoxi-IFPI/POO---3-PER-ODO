public class Outro {
    public static void main(String[] args) {
        Array a = new Array();
        a.notas[2] = 4.0;
        a.notas[0] = 3.0;
        a.notas[1] = 6.0;
        System.out.print(a.notas);

        Scanner leitor = new Scanner(System.in);
        System.out.print("buca linear");
        String buscar = leitor.nextLine();
    }
}