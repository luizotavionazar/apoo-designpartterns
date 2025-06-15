package src.service;

import src.model.Cliente;
import src.model.Produto;

public class PedidoService {
    public void gerarPedido(Cliente cliente, Produto produto) {
        System.out.println("::::: Pedido gerado para " + cliente.getNome() + " comprando " + produto.getNome());
    }
}