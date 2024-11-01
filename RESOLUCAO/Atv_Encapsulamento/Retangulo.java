public class Retangulo {
    private Double base, altura;

    public void setBase(double valor) {
        this.base = valor;
    }

    public Double getBase() {
        return this.base;
    }

    public void setAltuea(Double valor) {
        this.altura = valor;
    }

    public Double getaltura() {
        return this.altura;
    }

    public double calcularArea() {
        return this.base * this.altura / 2;

    }

}
