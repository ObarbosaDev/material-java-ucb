// Circulo herda de FormaGeometrica.
public class Circulo extends FormaGeometrica {
    // Raio do circulo.
    private double raio;

    // Construtor.
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Area = PI * raio^2.
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Perimetro = 2 * PI * raio.
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
