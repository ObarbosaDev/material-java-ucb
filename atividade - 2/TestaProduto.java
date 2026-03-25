// Classe de teste para executar a classe Produto
public class TestaProduto {

    // Metodo principal: ponto de inicio do programa
    public static void main(String[] args) {

        // Cria um objeto Produto com nome, preco e quantidade inicial
        Produto produto1 = new Produto("Caderno", 25.90, 10);

        // Usa os metodos set para alterar algumas informacoes do produto
        produto1.setNome("Caderno Universitario");
        produto1.setPreco(27.90);

        // Mostra os dados iniciais do produto
        System.out.println("=== INFORMACOES INICIAIS ===");
        produto1.exibirInformacoes();

        // Usa os metodos get para mostrar algumas informacoes separadas
        System.out.println("Nome pelo get: " + produto1.getNome());
        System.out.printf("Preco pelo get: R$ %.2f%n", produto1.getPreco());
        System.out.println("Estoque pelo get: " + produto1.getQuantidadeEmEstoque());

        // Adiciona 5 itens ao estoque
        System.out.println("\n=== ADICIONANDO AO ESTOQUE ===");
        produto1.adicionarAoEstoque(5);
        // Mostra as informacoes depois da adicao
        produto1.exibirInformacoes();

        // Remove 8 itens do estoque
        System.out.println("\n=== REMOVENDO DO ESTOQUE ===");
        produto1.removerDoEstoque(8);
        // Mostra as informacoes depois da remocao
        produto1.exibirInformacoes();

        // Tenta remover uma quantidade maior do que existe
        System.out.println("\n=== TESTE DE REMOCAO MAIOR QUE O ESTOQUE ===");
        produto1.removerDoEstoque(20);
        // Mostra as informacoes finais
        produto1.exibirInformacoes();
    }
}
