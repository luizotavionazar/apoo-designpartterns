package src.service;

import src.model.Cliente;
import src.model.Produto;

import src.pagamento.Pagamento;
import src.pagamento.PagamentoAVista;
import src.pagamento.PagamentoAPrazo;
import src.pagamento.PagamentoAdapter;

public class CompraFacade {
    private PedidoService pedido;
    private EstoqueService estoque;
    private EntregaService entrega;
    private Pagamento pagamento;
    private Timer timer;

    public CompraFacade() {
        this.pedido = new PedidoService();
        this.estoque = new EstoqueService();
        this.entrega = new EntregaService();
        this.pagamento = new PagamentoAdapter(new PagamentoAVista(), new PagamentoAPrazo());
        this.timer = new Timer();
    }

    public void realizarCompra(Cliente cliente, Produto produto, int formaPagamento) { //São as instruções de como a compra deve ser feita
        System.out.println("\n:::::::: Processando pedido...");
        timer.esperar();
        pedido.gerarPedido(cliente, produto);
        timer.esperar();
        pagamento.pagar(formaPagamento, produto.getPreco()); //Adaptado para realizar o pagamento em diferentes formas
        timer.esperar();
        estoque.baixarEstoque(produto);
        timer.esperar();
        entrega.agendarEntrega(cliente, produto);
        timer.esperar();
        System.out.println(":::::::: Pedido processado com sucesso!\n");
    }
}


