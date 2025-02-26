package aplication.produtos;

import aplication.enums.OrderStatus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Como o código não está conectado num banco de dados,
para verificar em program se um produto existe, foi criado
um método para criar e salvar num arquivo txt (produtos.txt) na linha 57
 */

public class Produtos {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public double valorEstoque() {
        return quantity * price;
    }

    public void salvarProduto() {
        try (FileWriter writer = new FileWriter("produtos.txt", true)) {
            writer.write(this.name + "," + this.price + "," + this.quantity + "\n");
            System.out.println("Produto cadastrado e salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o produto: " + e.getMessage());
        }
    }

    public static boolean verificarProduto(String nomeProduto) {
        try (BufferedReader reader = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];

                if (nome.equalsIgnoreCase(nomeProduto)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return false;
    }

    public OrderStatus produtoDesejado(String produtoDesejado, OrderStatus os1) {
        if (verificarProduto(produtoDesejado)) {
            System.out.println("Produto encontrado: " + produtoDesejado);
            return OrderStatus.PENDING_PAYMET;
        } else {
            System.out.println("Produto não encontrado: " + produtoDesejado);
            return os1;
        }
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
