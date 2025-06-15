public class PlayerDvd {
    String descricao;
    int faixaAtual;
    Amplificador amplificador;
    String filme;

    public PlayerDvd(String descricao, Amplificador amplificador) {
        this.descricao = descricao;
        this.amplificador = amplificador;
    }

    public void ligar() {
        System.out.println(descricao + ": ligado");
    }

    public void desligar() {
        System.out.println(descricao + ": desligado");
    }

    public void ejetar() {
        filme = null;
        System.out.println(descricao + ": ejetando DVD");
    }

    public void reproduzir(String filme) {
        this.filme = filme;
        faixaAtual = 0;
        System.out.println(descricao + ": reproduzindo \"" + filme + "\"...");
    }

    public void reproduzir(int faixa) {
        if (filme == null) {
            System.out.println(descricao + ": não pode reproduzir faixa " + faixa + ", sem DVD inserido");
        } else {
            faixaAtual = faixa;
            System.out.println(descricao + ": reproduzindo faixa " + faixaAtual + " de \"" + filme + "\"");
        }
    }

    public void parar() {
        faixaAtual = 0;
        System.out.println(descricao + ": encerrando o filme \"" + filme + "\"");
    }

    public void pausar() {
        System.out.println(descricao + ": pausado \"" + filme + "\"");
    }

    public void setarAudioDoisCanais() {
        System.out.println(descricao + ": configurando áudio para dois canais");
    }

    public void setarAudioSurround() {
        System.out.println(descricao + ": configurando áudio surround");
    }

    public String toString() {
        return descricao;
    }
}