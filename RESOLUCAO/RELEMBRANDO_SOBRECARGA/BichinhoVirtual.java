import javax.swing.JOptionPane;

public class BichinhoVirtual {
    private String nome;
    private int idade;
    private boolean vivo;
    private int calorias;
    private int forca;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.calorias = 10;
        this.forca = 10;
        this.vivo = true;
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo = true;
    }

    public String Nascer() {
        return "=========================================" + "\n" +
                "PARABENS, ANIMAL CRIADO COM SUCESSO" + "\n" +
                "=========================================" + "\n" +
                "Nome: " + this.nome + "\n" +
                "Forca: " + this.forca + "\n" +
                "Idade: " + this.idade;
    }

    public String Correr() {
        if ((this.forca > 0) && (this.forca <= 100) && (this.calorias > 0) && (this.calorias <= 100)) {
            this.forca -= 5;
            this.calorias -= 5;
            return "=========================" + "\n" +
                    "O ANIMAL ESTA CORRENDO!" + "\n" +
                    "---ENERGIA GASTA--- " + "\n" +
                    "=========================" + "\n" +
                    "Forca diminuio para: " + this.forca + "\n" +
                    "Calorias para: " + this.calorias;
        } else {
            return "o animal nao pode correr " + EStadoAnimal();
        }

    }

    public String Comer() {
        if ((this.calorias > 0) && (this.calorias <= 100)) {
            this.forca -= 2;
            this.calorias += 10;
            return "==============================" + "\n" +
                    "O ANIMAL ESTA COMENDO!" + "\n" +
                    "=============================" + "\n" +
                    "Forca diminuio para: " + this.forca + "\n" +
                    "Caloria aumentou para: " + this.calorias;
        } else {
            return " O animal nao pode comer " + EStadoAnimal();
        }
    }

    public String Dormir() {
        if (this.vivo = true) {
            this.forca += 10;
            this.calorias -= 2;
            this.idade += 1;
            return "=============================" + "\n" +
                    "O ANIMAL ESTA DORMINDO!" + "\n" +
                    "---RECARREGANDO ENERGIA--- " + "\n" +
                    "============================" + "\n" +
                    "Nova forca: " + this.forca + "\n" +
                    "Calorias: " + this.calorias;
        } else {
            return "O animal" + EStadoAnimal();
        }
    }

    public String EStadoAnimal() {
        if ((this.forca < 0) && (this.vivo == false) && (this.idade > 100)) {
            return "===================================" + "\n" +
                    "GA0E 6VERO O ANIMAL ESTA MORTO!" + "\n" +
                    "==================================" + "\n" +
                    "Sua forca chegou em  " + this.forca + "\n" +
                    "Sua Vida chegou em " + this.vivo + "\n";

        }
        if ((this.forca > 0) && (this.forca < 10) && (this.vivo == true) && (this.idade <= 100)) {
            return "==============================================" + "\n" +
                    "O ANIMAL PRECISA DORMIR PARA RECARREGAR!" + "\n" +
                    "=============================================" + "\n" +
                    "Sua forca chegpou em  " + this.forca + "\n" +
                    "Sua vida chegpou em " + this.vivo + "\n";
        }
        return "=== CRIE SEU ANIMAL ===";

    }

}
