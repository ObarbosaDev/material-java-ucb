// Classe base das contas.
public class ContaBancaria {
    // Dados da conta.
    protected String titular;
    protected String numeroConta;
    protected double saldo;

    // Construtor.
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Deposito simples.
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    // Saque padrao (nao deixa passar do saldo).
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
            return true;
        }

        System.out.println("Saque nao realizado. Saldo insuficiente.");
        return false;
    }

    // Exibe os dados principais.
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
