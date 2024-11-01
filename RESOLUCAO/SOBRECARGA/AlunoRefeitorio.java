public class AlunoRefeitorio {
    private String matricula;
    private int saldoCarteitinha;

    public AlunoRefeitorio(String matricula) {
        this.matricula = matricula;
        this.saldoCarteitinha = 5;
    }

    public int getSaldoCarteitinha() {
        return this.saldoCarteitinha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void SaldoAluno(int adicionarSaldo) {
        this.saldoCarteitinha += adicionarSaldo;
    }

    public String refeitorio() {
        if (this.saldoCarteitinha < 5) {
            return ("Recarregue sua carteirinha, seu saldo esta insuficiente para realizar a refeição");
        } else {
            int saldo = this.saldoCarteitinha -= 5;
            return ("Pagamento aceito: " + "novo saldo " + saldo + "R$");
        }
    }
}
