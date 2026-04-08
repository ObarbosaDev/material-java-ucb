// Gerente tambem e funcionario.
public class Gerente extends Funcionario {
    // Dado extra do gerente.
    private String departamento;

    // Construtor.
    public Gerente(String nome, int idade, double salario, String departamento) {
        // Define o cargo como Gerente.
        super(nome, idade, salario, "Gerente");
        this.departamento = departamento;
    }

    // Sobrescrita para incluir o departamento.
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}
