import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 04 - Novo salario com aumento de 25% ===");

        System.out.print("Digite o salario atual do funcionario: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Calcula o valor do aumento de 25%.
        double valorAumento = salarioAtual * 0.25;

        // Calcula o novo salario apos o aumento.
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salario atual: R$ %.2f%n", salarioAtual);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salario: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
