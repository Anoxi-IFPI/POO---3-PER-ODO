public class Conta {
    public static void main(String[] args) {
        private String numero;
        private Double saldo;

        public Conta(String numero){
            this.numero = numero;
            this.saldo = 0;
        }

        public Conta(){
            this.saldo = 10;
        }

        public void setNumero(String numero){
            this.numero = numero;
        }

        public String getNumero(){
            return this.numero;
        }

        public void DepositarQuantia(Double valor){
            this.saldo += valor;
        }

        public void SacarQuantia(Double valor){
            this.saldo -= valor;
        }
    }
}
