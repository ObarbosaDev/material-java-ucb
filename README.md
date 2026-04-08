# Material Java - UCB

Repositório com exercícios e materiais da disciplina de Programação Orientada a Objetos (POO) da Universidade Católica de Brasília.

O objetivo deste projeto é registrar a evolução das atividades práticas desenvolvidas em Java, cobrindo desde lógica básica com entrada de dados até conceitos introdutórios de orientação a objetos.

## Conteúdo do repositório

### Atividade 1

Exercícios de console com foco em operadores, entrada de dados e cálculos básicos:

- `Exercicio01.java`: soma de quatro números inteiros.
- `Exercicio02.java`: média aritmética de três notas.
- `Exercicio03.java`: média ponderada com pesos informados pelo usuário.
- `Exercicio04.java`: reajuste salarial com aumento fixo de 25%.
- `Exercicio05.java`: cálculo de novo salário com percentual variável.
- `Exercicio06.java`: salário final com gratificação de 5% e imposto de 7%.

Pasta: `atividade - 1/`

### Atividade 2

Exercício introdutório de orientação a objetos com encapsulamento, construtor, getters, setters e operações de estoque:

- `Produto.java`: classe que representa um produto.
- `TestaProduto.java`: classe de execução para testar o comportamento de `Produto`.

Pasta: `atividade - 2/`

### Aula 07

Exercícios sobre herança em Java com hierarquia de classes, sobrescrita de métodos e especialização de comportamento:

- `exercicio1/`: sistema de funcionários com as classes `Pessoa`, `Funcionario` e `Gerente`.
- `exercicio2/`: formas geométricas com `FormaGeometrica`, `Retangulo` e `Circulo` para cálculo de área e perímetro.
- `exercicio3/`: sistema bancário com `ContaBancaria`, `ContaCorrente` e `ContaPoupanca`.

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
|-- aula 07/
|   |-- exercicio1/
|   |   |-- Pessoa.java
|   |   |-- Funcionario.java
|   |   |-- Gerente.java
|   |   `-- Main.java
|   |-- exercicio2/
|   |   |-- FormaGeometrica.java
|   |   |-- Retangulo.java
|   |   |-- Circulo.java
|   |   `-- Main.java
|   `-- exercicio3/
|       |-- ContaBancaria.java
|       |-- ContaCorrente.java
|       |-- ContaPoupanca.java
|       `-- Main.java
`-- README.md
```

## Tecnologias utilizadas

- Java
- JDK para compilação e execução via terminal
- Git para versionamento

## Como executar

### Pré-requisito

Ter o Java instalado e o comando `javac` disponível no terminal.

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

Execute o exercício desejado:

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

### Executando a Aula 07

Entre na pasta da aula:

```bash
cd "aula 07"
```

Cada exercício foi separado em uma pasta com seu próprio `Main.java`.

#### Exercício 1

```bash
cd exercicio1
javac *.java
java Main
cd ..
```

#### Exercício 2

```bash
cd exercicio2
javac *.java
java Main
cd ..
```

#### Exercício 3

```bash
cd exercicio3
javac *.java
java Main
cd ..
```

## Conceitos praticados

- Entrada de dados com `Scanner`
- Operações matemáticas e formatação de saída
- Estruturas básicas de programas em Java
- Criação de classes e objetos
- Encapsulamento com atributos privados
- Uso de construtor, getters e setters
- Manipulação simples de estoque
- Herança com `extends`
- Sobrescrita com `@Override`
- Reuso de código com superclasse e subclasses

## Observações

- O repositório também possui arquivos `.class` gerados por compilação.
- A pasta `out/` contém artefatos produzidos pela IDE.
- Os exemplos atuais são voltados para estudo e execução local.

## Autor

Matheus Barbosa
