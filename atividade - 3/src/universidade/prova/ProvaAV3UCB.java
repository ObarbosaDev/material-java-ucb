package universidade.prova;

// Prova AV3 da UCB.
public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade, 1);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Pela regra da UCB, o aluno pode fazer AV3 mesmo se ja estiver aprovado.
        return true;
    }
}
