package src.pagamento;

public interface Pagamento {
    void pagar(int formaPagamento, double valor);
}