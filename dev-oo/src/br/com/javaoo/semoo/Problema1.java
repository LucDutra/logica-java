package br.com.javaoo.semoo;

import br.com.javaoo.entities.Product;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

/*

Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
public class Problema1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        Product mesa = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        mesa.setName(scanner.nextLine());
        System.out.print("Price: ");
        mesa.setPrice(scanner.nextDouble());
        System.out.print("Quantity in stock: ");
        mesa.addProducts(scanner.nextInt());

        System.out.println("Product data: " + mesa.getName() + " R$ " + mesa.getPrice() + ", "
                + mesa.getQuantity() + " Units, " + "Total: $ "
                + mesa.totalValueInStock());

        System.out.println("Enter the number of products to be added in stock: 5");
        mesa.addProducts(5);

        System.out.println("Product data: " + mesa.getName() + " R$ " + mesa.getPrice() + ", "
                + mesa.getQuantity() + " Units, " + "Total: $ "
                + mesa.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock: 3");
        mesa.removeProducts(3);
        System.out.println("Product data: " + mesa.getName() + " R$ " + mesa.getPrice() + ", "
                + mesa.getQuantity() + " Units, " + "Total: $ "
                + mesa.totalValueInStock());




    }
}
