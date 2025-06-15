package src.service;

import src.model.Cliente;
import src.model.Produto;

public class EntregaService {
    public void agendarEntrega(Cliente cliente, Produto produto) {
        System.out.println("::::: Entrega agendada para " + cliente.getNome() + " do produto " + produto.getNome());
    }
}