public class Retangulo {
    private Double base, altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getBase() {
        return this.base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return this.altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

}
