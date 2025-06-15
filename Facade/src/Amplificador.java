public class Amplificador {
    String descricao;
    Sintonizador tuner;
    PlayerDvd dvd;
    PlayerCd cd;

    public Amplificador(String descricao) {
        this.descricao = descricao;
    }

    public void ligar() {
        System.out.println(descricao + ": ligado");
    }

    public void desligar() {
        System.out.println(descricao + ": desligado");
    }

    public void setarSomEstereo() {
        System.out.println(descricao + ": modo estéreo ativado");
    }

    public void setarSomSurround() {
        System.out.println(descricao + ": som surround ativado (5 alto-falantes, 1 subwoofer)");
    }

    public void setarVolume(int nivel) {
        System.out.println(descricao + ": ajustando volume para " + nivel);
    }

    public void setarSintonizador(Sintonizador tuner) {
        System.out.println(descricao + ": conectando ao sintonizador " + tuner);
        this.tuner = tuner;
    }

    public void setarDvd(PlayerDvd dvd) {
        System.out.println(descricao + ": conectando ao DVD " + dvd);
        this.dvd = dvd;
    }

    public void setarCd(PlayerCd cd) {
        System.out.println(descricao + ": conectando ao CD " + cd);
        this.cd = cd;
    }

    public String toString() {
        return descricao;
    }
}