package src.pagamento;

public class PagamentoAPrazo { 
    public void efetuarPagamento(double valor) {
        System.out.println("::::: Pagamento realizado a prazo no valor de R$" + valor);
        System.out.println("::::: Gerado título a receber para vencimento em 30 dias");
    }
}