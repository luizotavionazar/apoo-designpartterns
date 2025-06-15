public class PlayerCd {
    String descricao;
    int faixaAtual;
    Amplificador amplificador;
    String titulo;

    public PlayerCd(String descricao, Amplificador amplificador) {
        this.descricao = descricao;
        this.amplificador = amplificador;
    }

    public void ligar() {
        System.out.println(descricao + " ligado");
    }

    public void desligar() {
        System.out.println(descricao + " desligado");
    }

    public void ejetar() {
        titulo = null;
        System.out.println(descricao + " ejetando CD");
    }

    public void reproduzir(String titulo) {
        this.titulo = titulo;
        faixaAtual = 0;
        System.out.println(descricao + " reproduzindo \"" + titulo + "\"");
    }

    public void reproduzir(int faixa) {
        if (titulo == null) {
            System.out.println(descricao + " não pode reproduzir faixa " + faixa + ", sem CD inserido");
        } else {
            faixaAtual = faixa;
            System.out.println(descricao + " reproduzindo faixa " + faixaAtual);
        }
    }

    public void parar() {
        faixaAtual = 0;
        System.out.println(descricao + " parado");
    }

    public void pausar() {
        System.out.println(descricao + " pausado \"" + titulo + "\"");
    }

    public String toString() {
        return descricao;
    }
}