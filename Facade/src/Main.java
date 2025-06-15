public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador("Amplificador");
        Sintonizador tuner = new Sintonizador("Sintonizador", amp);
        PlayerDvd dvd = new PlayerDvd("Player de DVD", amp);
        PlayerCd cd = new PlayerCd("Player de CD", amp);
        Projetor projetor = new Projetor("Projetor", dvd);
        LuzesDaSala luzes = new LuzesDaSala("Luzes da Sala");
        Tela tela = new Tela("Tela para Projeção");
        Pipoqueira pipoqueira = new Pipoqueira("Máquina de Pipoca");

        HomeTheater facade = new HomeTheater(amp, cd, dvd, pipoqueira, projetor, tela, luzes, tuner);
        facade.assistirFilme("Por um Punhado de Dólares");
        facade.terminarFilme();
    }
}