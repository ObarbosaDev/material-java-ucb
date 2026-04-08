// Retangulo herda de FormaGeometrica.
public class Retangulo extends FormaGeometrica {
    // Medidas do retangulo.
    private double largura;
    private double altura;

    // Construtor.
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Area = largura * altura.
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    // Perimetro = 2 * (largura + altura).
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
