# Material Java - UCB

Repositorio com exercicios e atividades da disciplina de Programacao Orientada a Objetos (POO) da Universidade Catolica de Brasilia.

O objetivo deste repositorio e registrar as atividades praticas desenvolvidas em Java, desde exercicios iniciais de logica ate exemplos com heranca, abstracao e polimorfismo.

## Conteudo do repositorio

### Atividade 1

Exercicios de console com foco em entrada de dados, operadores e calculos simples:

- `Exercicio01.java`: soma de quatro numeros inteiros.
- `Exercicio02.java`: media aritmetica de tres notas.
- `Exercicio03.java`: media ponderada com pesos informados pelo usuario.
- `Exercicio04.java`: reajuste salarial com aumento fixo de 25%.
- `Exercicio05.java`: calculo de novo salario com percentual variavel.
- `Exercicio06.java`: salario final com gratificacao de 5% e imposto de 7%.

Pasta: `atividade - 1/`

### Atividade 2

Exercicio introdutorio de orientacao a objetos com classe, objeto, construtor, encapsulamento, getters, setters e metodos:

- `Produto.java`: classe que representa um produto.
- `TestaProduto.java`: classe de teste para executar os metodos de `Produto`.

Pasta: `atividade - 2/`

### Atividade 3

Sistema de avaliacao universitaria com heranca e polimorfismo.

A atividade modela regras de avaliacao da UCB e da Fafifo usando classes abstratas e concretas:

- `ProvaUniversidade.java`: classe abstrata principal das provas.
- `ProvaUCB.java`: regra de avaliacao da UCB.
- `ProvaFafifo.java`: regra de avaliacao da Fafifo.
- `ProvaFinalUniversidade.java`: classe abstrata para prova final.
- `ProvaAV3UCB.java`: regra da AV3 da UCB.
- `ProvaFinalFafifo.java`: regra da prova final da Fafifo.
- `Teste.java`: classe com o metodo `main`.

Pasta: `atividade - 3/`

### Atividade 4

Projeto Java simples para testar conexao com banco de dados MySQL usando JDBC.

- `Conexao.java`: classe responsavel por abrir a conexao com o banco.
- `Principal.java`: classe com `main` para testar se a conexao foi realizada.

Pasta: `atividade - 4/ProjetoConexaoMySQL/`

### Aula 07

Exemplos e exercicios sobre heranca em Java:

- `exemplo1/`: exemplo com `Pessoa`, `Funcionario` e `Gerente`.
- `exemplo2/`: exemplo com formas geometricas.
- `exemplo3/`: exemplo com contas bancarias.
- `Exercicio - Formas Geometricas/`: exercicio de formas geometricas.

Pasta: `aula 07/`

## Estrutura

```text
.
|-- atividade - 1/
|   |-- Exercicio01.java
|   |-- Exercicio02.java
|   |-- Exercicio03.java
|   |-- Exercicio04.java
|   |-- Exercicio05.java
|   `-- Exercicio06.java
|-- atividade - 2/
|   |-- Produto.java
|   `-- TestaProduto.java
|-- atividade - 3/
|   |-- README.md
|   `-- src/
|       `-- universidade/
|           `-- prova/
|               |-- ProvaUniversidade.java
|               |-- ProvaUCB.java
|               |-- ProvaFafifo.java
|               |-- ProvaFinalUniversidade.java
|               |-- ProvaAV3UCB.java
|               |-- ProvaFinalFafifo.java
|               `-- teste/
|                   `-- Teste.java
|-- atividade - 4/
|   `-- ProjetoConexaoMySQL/
|       |-- README.md
|       |-- Conexao.java
|       `-- Principal.java
|-- aula 07/
`-- README.md
```

## Tecnologias utilizadas

- Java
- JDK para compilacao e execucao via terminal
- Git para versionamento

## Como executar

### Pre-requisito

Ter o Java instalado e o comando `javac` disponivel no terminal.

Para verificar:

```bash
javac -version
java -version
```

### Executando a Atividade 1

```bash
cd "atividade - 1"
javac *.java
java Exercicio01
```

Para testar outro exercicio, substitua `Exercicio01` pelo nome da classe desejada.

### Executando a Atividade 2

```bash
cd "atividade - 2"
javac *.java
java TestaProduto
```

### Executando a Atividade 3

```bash
cd "atividade - 3"
javac -d out src/universidade/prova/*.java src/universidade/prova/teste/*.java
java -cp out universidade.prova.teste.Teste
```

### Executando a Atividade 4

```bash
cd "atividade - 4/ProjetoConexaoMySQL"
javac Conexao.java Principal.java
java Principal
```

### Executando os exemplos da Aula 07

Entre na pasta da aula e depois na pasta do exemplo desejado:

```bash
cd "aula 07"
cd exemplo1
javac *.java
java Main
```

## Conceitos praticados

- Entrada de dados com `Scanner`
- Operacoes matematicas e formatacao de saida
- Criacao de classes e objetos
- Encapsulamento com atributos privados
- Construtores, getters e setters
- Heranca com `extends`
- Classes abstratas
- Polimorfismo
- Sobrescrita de metodos com `@Override`
- Organizacao de codigo em pacotes
- Conexao com banco de dados MySQL usando JDBC

## Observacoes

- O repositorio possui alguns arquivos `.class` gerados pela compilacao.
- A pasta `out/` contem arquivos gerados pela IDE ou pela compilacao dos exercicios.
- As atividades foram organizadas para estudo e execucao local.

## Autor

Matheus Barbosa
