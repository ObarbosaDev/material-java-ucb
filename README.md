# Material Java - UCB

Repositorio com exercicios e materiais da disciplina de Programacao Orientada a Objetos (POO) da Universidade Catolica de Brasilia.

O objetivo deste projeto e registrar a evolucao das atividades praticas desenvolvidas em Java, cobrindo desde logica basica com entrada de dados ate conceitos introdutorios de orientacao a objetos.

## Conteudo do repositorio

### Atividade 1

Exercicios de console com foco em operadores, entrada de dados e calculos basicos:

- `Exercicio01.java`: soma de quatro numeros inteiros.
- `Exercicio02.java`: media aritmetica de tres notas.
- `Exercicio03.java`: media ponderada com pesos informados pelo usuario.
- `Exercicio04.java`: reajuste salarial com aumento fixo de 25%.
- `Exercicio05.java`: calculo de novo salario com percentual variavel.
- `Exercicio06.java`: salario final com gratificacao de 5% e imposto de 7%.

Pasta: `atividade - 1/`

### Atividade 2

Exercicio introdutorio de orientacao a objetos com encapsulamento, construtor, getters, setters e operacoes de estoque:

- `Produto.java`: classe que representa um produto.
- `TestaProduto.java`: classe de execucao para testar o comportamento de `Produto`.

Pasta: `atividade - 2/`

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

Entre na pasta:

```bash
cd "atividade - 1"
```

Compile os arquivos:

```bash
javac *.java
```

Execute o exercicio desejado:

```bash
java Exercicio01
```

Substitua `Exercicio01` por qualquer classe da atividade:

- `Exercicio02`
- `Exercicio03`
- `Exercicio04`
- `Exercicio05`
- `Exercicio06`

Para voltar para a raiz do projeto:

```bash
cd ..
```

### Executando a Atividade 2

Entre na pasta:

```bash
cd "atividade - 2"
```

Compile os arquivos:

```bash
javac *.java
```

Execute a classe de teste:

```bash
java TestaProduto
```

## Conceitos praticados

- Entrada de dados com `Scanner`
- Operacoes matematicas e formatacao de saida
- Estruturas basicas de programas em Java
- Criacao de classes e objetos
- Encapsulamento com atributos privados
- Uso de construtor, getters e setters
- Manipulacao simples de estoque

## Observacoes

- O repositorio tambem possui arquivos `.class` gerados por compilacao.
- A pasta `out/` contem artefatos produzidos pela IDE.
- Os exemplos atuais sao voltados para estudo e execucao local.

## Autor

Matheus Barbosa
