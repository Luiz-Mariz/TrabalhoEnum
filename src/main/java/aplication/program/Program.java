package aplication.program;

import aplication.entities.Order;
import aplication.enums.OrderStatus;
import aplication.produtos.Produtos;
import java.util.Scanner;

/*Para o funcionamento do codigo tem a necesseidade
de cadastrar os produtos.

Dentro de produtos.txt ja vem cadastrado Banana e
Batata para o teste rapido do codigo
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Produtos produto = new Produtos();
        OrderStatus os1 = OrderStatus.PENDING;

        System.out.println("Informe o nome do produto que você deseja: ");
        String produtoDesejado = sc.next();

        os1 = produto.produtoDesejado(produtoDesejado, os1);

        boolean resultadoPedido = (order.resposta());
        order.showResult(resultadoPedido, os1);
    }
}
