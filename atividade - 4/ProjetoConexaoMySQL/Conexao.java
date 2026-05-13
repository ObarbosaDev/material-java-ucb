import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe responsavel por criar a conexao com o banco de dados MySQL.
public class Conexao {

    // Dados usados para conectar no banco.
    private final String url = "jdbc:mysql://localhost:3307/bdconexao";
    private final String usuario = "root";
    private final String senha = "catolica";

    public Connection conectar() {

        try {

            // Carrega o driver JDBC do MySQL.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tenta criar a conexao com o banco de dados.
            return DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException e) {

            System.out.println("Driver JDBC do MySQL nao encontrado.");

        } catch (SQLException e) {

            System.out.println("Erro ao conectar com o banco de dados.");

        } catch (Exception e) {

            System.out.println("Erro inesperado ao tentar conectar.");

        }

        return null;
    }
}
