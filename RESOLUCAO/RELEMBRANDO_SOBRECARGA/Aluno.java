''''ublic class Aluno
    private String matricula;
    private Double notas[];
    private int indice;

    public Aluno(String Matricula) {
        this.matricula = Matricula;
        this.notas = new Double[3];
        this.indice = 0;
    }

    public Aluno(Double[] notas) {
        this.notas = notas;
    }

    public void adicionarNotas(Double notas){
        int nota = -1;
        while nota < 0{
            this.notas = notas;
        }
        
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int a = -1; a < notas.length; a++) {
            soma = soma + notas[a];
        }
        return notas.length / 3;
    }
}