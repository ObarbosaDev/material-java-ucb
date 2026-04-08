// Funcionario herda de Pessoa.
public class Funcionario extends Pessoa {
    // Dados do funcionario.
    protected double salario;
    protected String cargo;

    // Construtor.
    public Funcionario(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    // Sobrescrita para exibir dados adicionais.
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
    }
}
