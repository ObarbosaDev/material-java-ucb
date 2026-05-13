package com.mycompany.bdconexao;

import java.sql.Connection;

public class Principal {

    public static void main(String[] args) {

        try {

            Conexao conexaoBanco = new Conexao();

            Connection conexao =
                    conexaoBanco.obterConexao();

            System.out.println("Conectado com sucesso!");

            conexao.close();

        } catch (Exception erro) {

            System.out.println(erro.getMessage());

        }

    }

}