// Classe base deste exercicio.
public class Pessoa {
    // Dados basicos.
    protected String nome;
    protected int idade;

    // Construtor.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Exibe os dados.
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
