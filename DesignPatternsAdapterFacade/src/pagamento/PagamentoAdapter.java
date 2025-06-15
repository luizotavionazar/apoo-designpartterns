package src.pagamento;

public class PagamentoAdapter implements Pagamento {
    private PagamentoAVista avista;
    private PagamentoAPrazo aprazo;

    public PagamentoAdapter(PagamentoAVista avista, PagamentoAPrazo aprazo) {
        this.avista = avista;
        this.aprazo = aprazo;
    }

    @Override
    public void pagar(int formaPagamento, double valor) {
        if (formaPagamento == 0) {
            avista.efetuarPagamentoAVista(valor);
        } else {
            aprazo.efetuarPagamentoAPrazo(valor);
        }
        
    }
}