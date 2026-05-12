package universidade.prova;

// Classe abstrata que representa a prova final de uma universidade.
public abstract class ProvaFinalUniversidade {

    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade, double pesoProvaFinal) {
        this.provaUniversidade = provaUniversidade;
        this.pesoProvaFinal = pesoProvaFinal;
        this.realizouProva = false;
    }

    // Cada universidade define se o aluno pode ou nao fazer a prova final.
    public abstract boolean habilitadoRealizarProva();

    public void realizarProva(double notaProvaFinal) {
        if (habilitadoRealizarProva()) {
            this.notaProvaFinal = notaProvaFinal;
            this.realizouProva = true;
            this.provaUniversidade.registrarProvaFinal(notaProvaFinal);
        }
    }

    public double getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public double getPesoProvaFinal() {
        return pesoProvaFinal;
    }

    public boolean isRealizouProva() {
        return realizouProva;
    }
}
