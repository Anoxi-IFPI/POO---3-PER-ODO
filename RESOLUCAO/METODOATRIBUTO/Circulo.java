public class Circulo {
    public double raio;

    public double CalcularArea() {
        double area = 3.14 * Math.pow(raio, 2);
        return area;
    }
}