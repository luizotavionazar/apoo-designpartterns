package src.service;

import src.model.Produto;

public class EstoqueService {
    public void baixarEstoque(Produto produto) {
        System.out.println("::::: Baixando estoque do produto: " + produto.getNome());
    }
}