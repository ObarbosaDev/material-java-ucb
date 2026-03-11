import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 03 - Media ponderada de 3 notas ===");

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        // Soma os produtos das notas pelos seus respectivos pesos.
        double somaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

        // Calcula a soma total dos pesos informados.
        double somaDosPesos = peso1 + peso2 + peso3;

        // Calcula a media ponderada.
        double mediaPonderada = somaPonderada / somaDosPesos;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Media ponderada: %.2f%n", mediaPonderada);

        scanner.close();
    }
}
