package src.pagamento;

public interface Pagamento {
    void pagar(int formaPagamento, double valor); //Metodo em comum para ambas as formas de pagamento
}