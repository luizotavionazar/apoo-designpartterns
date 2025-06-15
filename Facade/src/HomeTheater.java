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

    public void assistirFilme(String filme) {
        System.out.println("Preparando sessão para exibir o filme...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        pipoqueira.ligar();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        pipoqueira.estourarPipoca();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        luzes.regular(5);
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        tela.abaixar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        projetor.ligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        projetor.modoWidescreen();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        amp.ligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        amp.setarDvd(dvd);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        amp.setarSomSurround();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        amp.setarVolume(5);
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        dvd.ligar();
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
        dvd.reproduzir(filme);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.println("Interrompido!");
            Thread.currentThread().interrupt();
        }
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