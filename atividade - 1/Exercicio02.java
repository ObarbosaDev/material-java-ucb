import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 02 - Media aritmetica de 3 notas ===");

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a media aritmetica das tres notas.
        double mediaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Media aritmetica: %.2f%n", mediaFinal);

        scanner.close();
    }
}
