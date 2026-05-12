# Sistema de Avaliacao Universitaria

Atividade de Programacao Orientada a Objetos em Java sobre heranca, abstracao, polimorfismo e classes abstratas.

O sistema simula regras de avaliacao de duas instituicoes:

- UCB: media minima 7,0.
- Fafifo: media minima 6,0.

## Estrutura

```text
atividade - 3/
|-- README.md
`-- src/
    `-- universidade/
        `-- prova/
            |-- ProvaUniversidade.java
            |-- ProvaUCB.java
            |-- ProvaFafifo.java
            |-- ProvaFinalUniversidade.java
            |-- ProvaAV3UCB.java
            |-- ProvaFinalFafifo.java
            `-- teste/
                `-- Teste.java
```

## Regras usadas

### UCB

- AV1 e AV2 tem peso 1.
- A media minima para aprovacao e 7,0.
- A AV3 pode ser feita mesmo se o aluno ja estiver aprovado.
- Quando a AV3 e realizada, ela substitui a menor nota entre AV1 e AV2.
- A media final fica com as duas maiores notas.

### Fafifo

- AV1 tem peso 1.
- AV2 tem peso 1.
- AV3 tem peso 3.
- A media minima para aprovacao e 6,0.
- A AV3 so e realizada quando o aluno ainda nao atingiu a media.
- Quando a AV3 e realizada, ela entra na media ponderada junto com AV1 e AV2.

## Como compilar e executar

Entre na pasta da atividade:

```bash
cd "atividade - 3"
```

Compile os arquivos:

```bash
javac -d out src/universidade/prova/*.java src/universidade/prova/teste/*.java
```

Execute a classe de teste:

```bash
java -cp out universidade.prova.teste.Teste
```

## Conceitos praticados

- Classes abstratas
- Heranca com `extends`
- Polimorfismo
- Encapsulamento
- Sobrescrita de metodos com `@Override`
- Organizacao de classes em pacotes
