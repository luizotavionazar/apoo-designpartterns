package src;

public class ImpressoraFacade {
    private Inicializador inicializador = new Inicializador();
    private Verificador verificador = new Verificador();
    private Processador processador = new Processador();
    private DispositivoImpressao impressora = new DispositivoImpressao();

    public void imprimirDocumento(String texto) {
        inicializador.iniciar();
        verificador.verificarPapel();
        verificador.verificarTinta();
        processador.processarTexto(texto);
        impressora.imprimir();
    }
}