package com.mycompany.bdconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3307/bdconexao";

    private static final String USUARIO = "root";

    private static final String SENHA = "catolica";

    public Connection obterConexao() throws Exception {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao =
                    DriverManager.getConnection(URL, USUARIO, SENHA);

            System.out.println(
                    "Conexão com o banco de dados estabelecida com sucesso");

            return conexao;

        } catch (ClassNotFoundException e) {

            throw new Exception(
                    "Driver JDBC do MySQL não encontrado: "
                            + e.getMessage());

        } catch (SQLException e) {

            throw new Exception(
                    "Erro na conexão com o banco: "
                            + e.getMessage());

        }

    }

}