// Classe principal para testar o exercicio 1.
public class Main {
    public static void main(String[] args) {
        // Objetos de teste.
        Pessoa pessoa = new Pessoa("Ana", 20);
        Funcionario funcionario = new Funcionario("Carlos", 28, 3000.00, "Analista");
        Gerente gerente = new Gerente("Marina", 35, 7000.00, "TI");

        System.out.println("=== EXERCICIO 1: SISTEMA DE FUNCIONARIOS ===");

        // Teste com Pessoa.
        pessoa.exibirDados();
        System.out.println();

        // Teste com Funcionario.
        funcionario.exibirDados();
        System.out.println();

        // Teste com Gerente.
        gerente.exibirDados();
    }
}
