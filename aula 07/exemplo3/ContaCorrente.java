// Conta corrente com limite especial.
public class ContaCorrente extends ContaBancaria {
    // Limite extra.
    private double limiteEspecial;

    // Construtor.
    public ContaCorrente(String titular, String numeroConta, double saldoInicial, double limiteEspecial) {
        super(titular, numeroConta, saldoInicial);
        this.limiteEspecial = limiteEspecial;
    }

    // Sobrescrita da regra de saque por causa do limite.
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limiteEspecial)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta corrente.");
            return true;
        }

        System.out.println("Saque nao realizado. Limite insuficiente.");
        return false;
    }
}
