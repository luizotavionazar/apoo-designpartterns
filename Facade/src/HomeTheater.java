import java.util.concurrent.TimeUnit;

public class HomeTheater {
    Amplificador amp;
    PlayerCd cd;
    PlayerDvd dvd;
    Pipoqueira pipoqueira;
    Projetor projetor;
    Tela tela;
    LuzesDaSala luzes;
    Sintonizador tuner;

    public HomeTheater(Amplificador amp, PlayerCd cd, PlayerDvd dvd, Pipoqueira pipoqueira, Projetor projetor, Tela tela, LuzesDaSala luzes, Sintonizador tuner) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.pipoqueira = pipoqueira;
        this.projetor = projetor;
        this.tela = tela;
        this.luzes = luzes;
        this.tuner = tuner;
    }
    
    public void assistirFilme(String filme, int brilho, boolean luzLigada, boolean widescreen, int volume) {
        System.out.println("Preparando sessão para exibir o filme...");
        if (!luzLigada) luzes.ligar();
        luzes.regular(brilho);
        tela.abaixar();
        projetor.ligar();
        if (widescreen) projetor.modoWidescreen();
        else projetor.modoTv();
        amp.ligar();
        amp.setarDvd(dvd);
        amp.setarSomSurround();
        amp.setarVolume(volume);
        pipoqueira.ligar();
        pipoqueira.estourarPipoca();
        dvd.ligar();
        dvd.reproduzir(filme);
    }

    public void terminarFilme() {
        System.out.println("\nO filme acabou!");
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        System.out.println("Desligando os equipamentos da sala...");
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        pipoqueira.desligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        luzes.ligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        tela.levantar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        projetor.desligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        amp.desligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        dvd.parar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        dvd.ejetar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        dvd.desligar();
    }
}