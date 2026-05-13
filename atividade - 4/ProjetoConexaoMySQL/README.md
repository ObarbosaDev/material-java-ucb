# ProjetoConexaoMySQL

Atividade simples em Java para testar uma conexao com banco de dados MySQL usando JDBC.

## Estrutura

```text
ProjetoConexaoMySQL/
|-- Conexao.java
`-- Principal.java
```

## Classes

- `Conexao.java`: possui os dados do banco e o metodo `conectar()`.
- `Principal.java`: possui o metodo `main()` e testa se a conexao foi feita.

## Dados de conexao

```java
private final String url = "jdbc:mysql://localhost:3307/bdconexao";
private final String usuario = "root";
private final String senha = "catolica";
```

## Como executar

Entre na pasta do projeto:

```bash
cd "atividade - 4/ProjetoConexaoMySQL"
```

Compile:

```bash
javac Conexao.java Principal.java
```

Execute:

```bash
java Principal
```

## Observacao

Para conectar de verdade, o MySQL precisa estar aberto, o banco `bdconexao` precisa existir e o driver JDBC do MySQL precisa estar configurado no projeto.
