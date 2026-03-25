import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Exercicio 05 - Salario com percentual de aumento ===");

        System.out.print("Digite o salario atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentualAumento = scanner.nextDouble();

        // Calcula o valor do aumento com base no percentual informado.
        double valorAumento = salarioAtual * (percentualAumento / 100);

        // Calcula o novo salario apos aplicar o aumento.
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salario atual: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento: %.2f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salario: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
