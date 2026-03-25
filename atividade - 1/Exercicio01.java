import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 01 - Soma de 4 numeros inteiros ===");

        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();

        System.out.print("Digite o quarto numero: ");
        int quartoNumero = scanner.nextInt();

        // Calcula a soma dos quatro numeros informados.
        int soma = primeiroNumero + segundoNumero + terceiroNumero + quartoNumero;

        System.out.println("\n--- Resultado ---");
        System.out.println("Soma dos numeros: " + soma);

        scanner.close();
    }
}
