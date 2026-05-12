package universidade.prova;

// Classe concreta com as regras de avaliacao da UCB.
public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2) {
        super(av1, av2, 0, 7);
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
    }

    @Override
    public double calcularMedia() {
        if (!realizouProvaFinal) {
            return (av1 + av2) / 2;
        }

        // Na UCB, a media final fica com as duas maiores notas.
        double menorNota = Math.min(av1, Math.min(av2, av3));
        double somaDasTresNotas = av1 + av2 + av3;

        return (somaDasTresNotas - menorNota) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}
