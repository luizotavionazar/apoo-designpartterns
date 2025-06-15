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
        
        System.out.println("\n:::::::: Gerador de Pedido Simples"); //Interface que o cliente utiliza
                                                                      //Ele não quer saber o que o sistema tem que fazer para efetivar sua compra, só quer faze-lá
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
        compra.realizarCompra(cliente, produto, formaPagamento); //A 'fachada' que irá chamar todos os serviços necessário para efetivar a compra do cliente
                                                                 //É a divisão do código da parte de alto nível (o que deve ser feito) para o baixo nível (como deve ser feito)
        in.close();
    }
}