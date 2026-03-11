import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 06 - Salario final com gratificacao e imposto ===");

        System.out.print("Digite o salario base: R$ ");
        double salarioBase = scanner.nextDouble();

        // Calcula a gratificacao de 5% sobre o salario base.
        double gratificacao = salarioBase * 0.05;

        // Calcula o imposto de 7% sobre o salario base.
        double imposto = salarioBase * 0.07;

        // Calcula o salario final apos adicionar a gratificacao e subtrair o imposto.
        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salario base: R$ %.2f%n", salarioBase);
        System.out.printf("Gratificacao: R$ %.2f%n", gratificacao);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salario final: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
