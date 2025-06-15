public class Pipoqueira {
    String descricao;

    public Pipoqueira(String descricao) {
        this.descricao = descricao;
    }

    public void ligar() {
        System.out.println(descricao + ": ligada");
    }

    public void desligar() {
        System.out.println(descricao + ": desligada");
    }

    public void estourarPipoca() {
        System.out.println(descricao + ": pipocando as pipocas");
    }

    public String toString() {
        return descricao;
    }
}