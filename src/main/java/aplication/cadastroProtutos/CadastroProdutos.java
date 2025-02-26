package aplication.cadastroProtutos;
import aplication.produtos.Produtos;

import java.io.FileWriter;
import java.io.IOException;
import java.security.ProtectionDomain;
import java.util.Locale;
import java.util.Scanner;

/* Cadastro dos protudos para os usuarios
 conseguirem compralos
 */

public class CadastroProdutos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        System.out.print("Insira o nome produto: ");
        produtos.setName(sc.next());

        System.out.print("Insira o preço do produto: ");
        produtos.setPrice(sc.nextDouble());

        System.out.print("Adicionar produtos: ");
        produtos.addProducts(sc.nextInt());
        System.out.print("Remover produtos: ");
        produtos.removeProducts(sc.nextInt());

        System.out.println(" ");
        System.out.println("Nome produto :" + produtos.getName());
        System.out.println("Quantidade produto: " + produtos.getQuantity());
        System.out.println("Valor total do produto no estoque: " + produtos.valorEstoque());

        produtos.salvarProduto();

    }
}


