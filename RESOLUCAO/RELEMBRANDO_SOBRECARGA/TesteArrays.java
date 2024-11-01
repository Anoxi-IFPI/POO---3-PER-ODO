public class TesteArrays {
    private String matricula;
    private Double[] notas;
    private int indice;

    public TesteArrays(String matricula) {
        this.matricula = matricula;
        this.notas = new Double[3];
        this.indice = 0;
    }

    public TesteArrays() {
        this.notas = new Double[3];
        this.indice = 0;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void AdicionarNota(Double nota) {
        if (indice < 3) {
            notas[indice] = nota;
            System.out.print("na posição " + indice + 1 + "adicionada nota " + this.notas);
        } else {
            System.out.print("nao é mais possivel adicionar um valor,o array tem tamanho de 0 a 2");
        }
    }

    public Double MediaBimestral() {
        double soma = 0.0;
        for (int a = 0; a < indice; a++) {
            soma += notas[a];
        }
        return soma / indice;
    }

}
