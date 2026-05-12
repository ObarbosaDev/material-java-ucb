package universidade.prova.teste;

import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaFinalUniversidade;
import universidade.prova.ProvaUCB;
import universidade.prova.ProvaUniversidade;

// Classe principal usada para testar o sistema.
public class Teste {

    public static void main(String[] args) {
        // Criacao dos objetos usando o tipo da classe abstrata.
        // Isso mostra o polimorfismo, pois cada objeto calcula a media do seu jeito.
        ProvaUniversidade provaUcb = new ProvaUCB(6.5, 8.0);
        ProvaUniversidade provaFafifo = new ProvaFafifo(5.0, 6.0);

        // Cada universidade retorna a sua propria prova final.
        ProvaFinalUniversidade av3Ucb = provaUcb.getProvaFinalUniversidade();
        ProvaFinalUniversidade finalFafifo = provaFafifo.getProvaFinalUniversidade();

        // Informando as notas da AV3/prova final para testar as regras.
        av3Ucb.realizarProva(9.0);
        finalFafifo.realizarProva(7.0);

        // Exibe media final e situacao do aluno em cada universidade.
        exibirResultado("UCB", provaUcb);
        exibirResultado("Fafifo", provaFafifo);
    }

    private static void exibirResultado(String nomeUniversidade, ProvaUniversidade prova) {
        // Mostra as notas, pesos, media e resultado final.
        System.out.println("=== " + nomeUniversidade + " ===");
        System.out.printf("AV1: %.2f | Peso: %.0f%n", prova.getAv1(), prova.getPesoAv1());
        System.out.printf("AV2: %.2f | Peso: %.0f%n", prova.getAv2(), prova.getPesoAv2());

        if (prova.isRealizouProvaFinal()) {
            System.out.printf("AV3/Final: %.2f | Peso: %.0f%n", prova.getAv3(), prova.getPesoAv3());
        } else {
            System.out.println("AV3/Final: nao realizada");
        }

        System.out.printf("Media minima: %.2f%n", prova.getMediaMinima());
        System.out.printf("Media final: %.2f%n", prova.calcularMedia());
        System.out.println("Situacao: " + (prova.aprovado() ? "Aprovado" : "Reprovado"));
        System.out.println();
    }
}
