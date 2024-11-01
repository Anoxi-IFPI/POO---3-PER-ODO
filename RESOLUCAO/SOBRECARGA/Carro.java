public class Carro {
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    public void IncrementarAceleração(int acelerar) {
        int x = 1;
        while (x != 0) {
            this.velocidade = acelerar + 1;
            x++;
        }
    }

    public void AcelerarCarro(int Acelerar) {
        this.velocidade += Acelerar;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

}
