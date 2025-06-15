import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Amplificador amp = new Amplificador("Amplificador");
        Sintonizador tuner = new Sintonizador("Sintonizador", amp);
        PlayerDvd dvd = new PlayerDvd("Player de DVD", amp);
        PlayerCd cd = new PlayerCd("Player de CD", amp);
        Projetor projetor = new Projetor("Projetor", dvd);
        LuzesDaSala luzes = new LuzesDaSala("Luzes da Sala");
        Tela tela = new Tela("Tela para Projeção");
        Pipoqueira pipoqueira = new Pipoqueira("Máquina de Pipoca");

        HomeTheater facade = new HomeTheater(amp, cd, dvd, pipoqueira, projetor, tela, luzes, tuner);

        int brilhoAtual = 50;
        boolean luzLigada = true;
        boolean widescreen = true;
        int volumeAtual = 5;

        int opcao;
        do {
            System.out.println("\n==== MENU HOME THEATER ====");
            System.out.println("1 - Assistir a um filme");
            System.out.println("2 - Ouvir um CD");
            System.out.println("3 - Ouvir rádio (sintonizador)");
            System.out.println("4 - Configurar o projetor");
            System.out.println("5 - Controlar luzes");
            System.out.println("6 - Controlar pipoqueira");
            System.out.println("7 - Controlar volume do amplificador");
            System.out.println("8 - Ejetar e desligar equipamentos");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    facade.assistirFilme("Por um Punhado de Dólares", brilhoAtual, luzLigada, widescreen, volumeAtual);
                    facade.terminarFilme();
                    break;
                case 2:
                    amp.ligar();
                    amp.setarCd(cd);
                    amp.setarSomEstereo();
                    amp.setarVolume(volumeAtual);
                    cd.ligar();
                    cd.reproduzir("Greatest Hits");
                    break;
                case 3:
                    tuner.ligar();
                    tuner.setarModoFm();
                    tuner.setarFrequencia(102.5);
                    amp.ligar();
                    amp.setarSintonizador(tuner);
                    amp.setarVolume(volumeAtual);
                    break;
                case 4:
                    projetor.ligar();
                    System.out.println("1 - Modo Widescreen");
                    System.out.println("2 - Modo TV");
                    System.out.print("Escolha o modo: ");
                    int modo = scanner.nextInt();
                    widescreen = (modo == 1);
                    if (widescreen) projetor.modoWidescreen();
                    else projetor.modoTv();
                    break;
                case 5:
                    System.out.println("1 - Ligar luzes");
                    System.out.println("2 - Desligar luzes");
                    System.out.println("3 - Regular brilho (0 a 100)");
                    int lOp = scanner.nextInt();
                    if (lOp == 1) {
                        luzes.ligar();
                        luzLigada = true;
                    } else if (lOp == 2) {
                        luzes.desligar();
                        luzLigada = false;
                    } else {
                        System.out.print("Digite o nível de brilho: ");
                        brilhoAtual = scanner.nextInt();
                        luzes.regular(brilhoAtual);
                    }
                    break;
                case 6:
                    pipoqueira.ligar();
                    pipoqueira.estourarPipoca();
                    pipoqueira.desligar();
                    break;
                case 7:
                    amp.ligar();
                    System.out.print("Volume desejado (0 a 10): ");
                    volumeAtual = scanner.nextInt();
                    amp.setarVolume(volumeAtual);
                    break;
                case 8:
                    dvd.parar();
                    dvd.ejetar();
                    dvd.desligar();
                    cd.ejetar();
                    cd.desligar();
                    amp.desligar();
                    projetor.desligar();
                    tuner.desligar();
                    break;
                case 9:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);

        scanner.close();
    }
}
