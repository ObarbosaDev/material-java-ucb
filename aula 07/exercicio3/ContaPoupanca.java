// Conta poupanca com rendimento.
public class ContaPoupanca extends ContaBancaria {
    // 0.01 = 1%.
    private double taxaRendimento;

    // Construtor.
    public ContaPoupanca(String titular, String numeroConta, double saldoInicial, double taxaRendimento) {
        super(titular, numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Aplica rendimento sobre o saldo atual.
    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$ " + rendimento);
    }
}
