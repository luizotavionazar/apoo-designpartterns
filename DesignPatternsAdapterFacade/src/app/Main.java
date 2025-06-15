package src.app;

import java.util.Scanner;

import src.model.Cliente;
import src.model.Produto;

import src.service.CompraFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n:::::::: UTILIZANDO ADAPTER E FAÇADE");
        System.out.println(":::::::: APOO - Design Patterns");
        System.out.println(":::::::: Luiz Otávio Nazar - TADS 5º");
        
        System.out.println("\n:::::::: Gerador de Pedido Simples");
        System.out.print("::: Nome do Cliente: ");
        Cliente cliente = new Cliente(in.nextLine());

        System.out.print("::: Produto: ");
        String prod = in.nextLine();
        System.out.print("::: Preço: ");
        double valor = in.nextInt(); in.nextLine();
        Produto produto = new Produto(prod, valor);

        System.out.print("::: Forma de Pagamento [0] A VISTA [1] A PRAZO: ");
        int formaPagamento = in.nextInt(); in.nextLine();

        CompraFacade compra = new CompraFacade();
        compra.realizarCompra(cliente, produto, formaPagamento);
        in.close();
    }
}