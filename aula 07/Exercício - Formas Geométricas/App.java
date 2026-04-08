// Classe principal para testar o exercicio 2.
public class App {
    public static void main(String[] args) {
        // Objetos de teste.
        Retangulo retangulo = new Retangulo(5, 3);
        Circulo circulo = new Circulo(2);

        System.out.println("=== EXERCICIO 2: FORMAS GEOMETRICAS ===");

        // Teste com Retangulo.
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());

        // Teste com Circulo.
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do circulo: " + circulo.calcularPerimetro());
    }
}
