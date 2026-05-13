import java.sql.Connection;

// Classe principal usada para testar a conexao com o banco.
public class Principal {

    public static void main(String[] args) {

        // Cria um objeto da classe Conexao.
        Conexao conexaoBanco = new Conexao();

        // Chama o metodo conectar e guarda o retorno.
        Connection conexao = conexaoBanco.conectar();

        if (conexao != null) {

            System.out.println("Conexão realizada com sucesso!");

        } else {

            System.out.println("Falha ao conectar ao banco de dados.");

        }
    }
}
