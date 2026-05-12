package universidade.prova;

// Classe concreta com as regras de avaliacao da Fafifo.
public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2) {
        super(av1, av2, 0, 6);
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;
    }

    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) {
            return ((av1 * pesoAv1) + (av2 * pesoAv2)) / (pesoAv1 + pesoAv2);
        }

        // Na Fafifo, a AV3 entra junto com as outras notas e tem peso maior.
        double somaNotas = (av1 * pesoAv1) + (av2 * pesoAv2) + (av3 * pesoAv3);
        double somaPesos = pesoAv1 + pesoAv2 + pesoAv3;

        return somaNotas / somaPesos;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}
