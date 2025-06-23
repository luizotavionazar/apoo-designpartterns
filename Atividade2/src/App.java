package src;

public class App {
    public static void main(String[] args) throws Exception {
        ImpressoraFacade impressora = new ImpressoraFacade();
        impressora.imprimirDocumento("Documento de exemplo");
    }
}