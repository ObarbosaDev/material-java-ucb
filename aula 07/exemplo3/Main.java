// Classe principal para testar o exercicio 3.
public class Main {
    public static void main(String[] args) {
        // Contas de teste.
        ContaCorrente contaCorrente = new ContaCorrente("Joao", "001-9", 1000.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Julia", "002-7", 2000.00, 0.01);

        System.out.println("=== EXERCICIO 3: SISTEMA BANCARIO ===");

        // Teste com ContaCorrente.
        contaCorrente.exibirSaldo();
        contaCorrente.sacar(1200.00);
        contaCorrente.exibirSaldo();

        System.out.println();

        // Teste com ContaPoupanca.
        contaPoupanca.exibirSaldo();
        contaPoupanca.aplicarRendimento();
        contaPoupanca.exibirSaldo();
    }
}
