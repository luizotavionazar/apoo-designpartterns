public class Projetor {
    String descricao;
    PlayerDvd playerDvd;

    public Projetor(String descricao, PlayerDvd playerDvd) {
        this.descricao = descricao;
        this.playerDvd = playerDvd;
    }

    public void ligar() {
        System.out.println(descricao + ": ligado");
    }

    public void desligar() {
        System.out.println(descricao + ": desligado");
    }

    public void modoWidescreen() {
        System.out.println(descricao + ": em modo widescreen (proporção 16x9)");
    }

    public void modoTv() {
        System.out.println(descricao + ": em modo TV (proporção 4x3)");
    }

    public String toString() {
        return descricao;
    }
}