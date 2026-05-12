package universidade.prova;

// Classe abstrata que serve como modelo para as provas das universidades.
public abstract class ProvaUniversidade {

    // Notas das avaliacoes.
    protected double av1;
    protected double av2;
    protected double av3;

    // Pesos das avaliacoes.
    protected double pesoAv1;
    protected double pesoAv2;
    protected double pesoAv3;

    // Media minima para o aluno ser aprovado.
    protected double mediaMinima;

    // Indica se o aluno realizou a prova final ou AV3.
    protected boolean realizouProvaFinal;

    public ProvaUniversidade(double av1, double av2, double av3, double mediaMinima) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
        this.mediaMinima = mediaMinima;
        this.realizouProvaFinal = false;
    }

    // Cada universidade calcula a media de uma forma diferente.
    public abstract double calcularMedia();

    // Cada universidade retorna sua propria regra de prova final.
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    // Metodo concreto, reaproveitado pelas classes filhas.
    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }

    public void registrarProvaFinal(double nota) {
        this.av3 = nota;
        this.realizouProvaFinal = true;
    }

    public double getAv1() {
        return av1;
    }

    public double getAv2() {
        return av2;
    }

    public double getAv3() {
        return av3;
    }

    public double getPesoAv1() {
        return pesoAv1;
    }

    public double getPesoAv2() {
        return pesoAv2;
    }

    public double getPesoAv3() {
        return pesoAv3;
    }

    public double getMediaMinima() {
        return mediaMinima;
    }

    public boolean isRealizouProvaFinal() {
        return realizouProvaFinal;
    }
}
