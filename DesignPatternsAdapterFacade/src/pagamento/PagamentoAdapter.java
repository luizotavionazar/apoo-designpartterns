package src.pagamento;

public class PagamentoAdapter implements Pagamento {
    private PagamentoAVista avista;
    private PagamentoAPrazo aprazo;

    public PagamentoAdapter(PagamentoAVista avista, PagamentoAPrazo aprazo) {
        this.avista = avista;
        this.aprazo = aprazo;
    }

    @Override
    public void pagar(int formaPagamento, double valor) { //Adaptação do pagamento realizando o processo necessário conforme a forma de pagamento
        if (formaPagamento == 0) {
            avista.efetuarPagamento(valor);
        } else {
            aprazo.efetuarPagamento(valor);
        }
        
    }
}



