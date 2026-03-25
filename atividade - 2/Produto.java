// Classe Produto: representa um produto no estoque
public class Produto {

    // Atributo para guardar o nome do produto
    private String nome;

    // Atributo para guardar o preco do produto
    private double preco;

    // Atributo para guardar quantos itens existem no estoque
    private int quantidadeEmEstoque;

    // Construtor da classe: recebe os dados iniciais do produto
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        // Guarda o nome recebido no atributo nome
        this.nome = nome;
        // Guarda o preco recebido no atributo preco
        this.preco = preco;
        // Guarda a quantidade recebida no atributo quantidadeEmEstoque
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Metodo get: retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // Metodo set: altera o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo get: retorna o preco do produto
    public double getPreco() {
        return preco;
    }

    // Metodo set: altera o preco do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo get: retorna a quantidade em estoque
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Metodo set: altera a quantidade em estoque
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Metodo para exibir as informacoes do produto na tela
    public void exibirInformacoes() {
        // Mostra o nome do produto
        System.out.println("Nome: " + nome);
        // Mostra o preco do produto com 2 casas decimais
        System.out.printf("Preco: R$ %.2f%n", preco);
        // Mostra a quantidade atual no estoque
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // Metodo para adicionar itens ao estoque
    public void adicionarAoEstoque(int quantidade) {
        // Soma a quantidade informada com a quantidade atual em estoque
        quantidadeEmEstoque = quantidadeEmEstoque + quantidade;
        // Mensagem para confirmar a adicao
        System.out.println(quantidade + " item(ns) adicionado(s) ao estoque.");
    }

    // Metodo para remover itens do estoque
    public void removerDoEstoque(int quantidade) {
        // Verifica se existe quantidade suficiente para remover
        if (quantidade <= quantidadeEmEstoque) {
            // Se tiver, subtrai do estoque
            quantidadeEmEstoque = quantidadeEmEstoque - quantidade;
            // Mensagem para confirmar a remocao
            System.out.println(quantidade + " item(ns) removido(s) do estoque.");
        } else {
            // Se nao tiver, mostra mensagem de erro
            System.out.println("Nao ha estoque suficiente para remover " + quantidade + " item(ns).");
        }
    }
}
