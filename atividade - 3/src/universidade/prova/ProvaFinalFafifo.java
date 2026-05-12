package universidade.prova;

// Prova final da Fafifo.
public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade, 3);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Na Fafifo, a prova final so e feita se o aluno ainda nao atingiu a media.
        return !provaUniversidade.aprovado();
    }
}
