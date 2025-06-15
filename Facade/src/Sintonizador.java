public class Sintonizador {
    String descricao;
    Amplificador amplificador;
    double frequencia;

    public Sintonizador(String descricao, Amplificador amplificador) {
        this.descricao = descricao;
        this.amplificador = amplificador;
    }

    public void ligar() {
        System.out.println(descricao + ": ligado");
    }

    public void desligar() {
        System.out.println(descricao + ": desligado");
    }

    public void setarFrequencia(double frequencia) {
        System.out.println(descricao + ": sintonizando frequência " + frequencia);
        this.frequencia = frequencia;
    }

    public void setarModoAm() {
        System.out.println(descricao + ": configurando modo AM");
    }

    public void setarModoFm() {
        System.out.println(descricao + ": configurando modo FM");
    }

    public String toString() {
        return descricao;
    }
}