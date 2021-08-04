package br.com.javaoo;

import br.com.javaoo.comoo.Circulo;
import br.com.javaoo.comoo.Triangulo;
import br.com.javaoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*   Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Objetos ORIENTADO PUBLICOS - sem utilizar SET E GET

        Triangulo x = new Triangulo();



        System.out.println("Entre com os valores de area do  triangulo");
        x.lado1 = scanner.nextDouble();
        x.lado2 = scanner.nextDouble();
        x.lado3 = scanner.nextDouble();

        x.calculaArea();

        System.out.println("Entre com os valores de area do  triangulo");
        Triangulo y  = new Triangulo();
        y.lado1 = scanner.nextDouble();
        y.lado2 = scanner.nextDouble();
        y.lado3 = scanner.nextDouble();

        y.calculaArea();




        Circulo a = new Circulo();
        System.out.println("Informe o raio: ");
        a.raio = scanner.nextDouble();

        a.calculaArea();

        scanner.close();
       */


         //    Objetos PRIVADO - SET (RECEBENDO INFO)   // GET(INFORMANDO OS DADOS)


        Product eletrodomestico = new Product();
        eletrodomestico.setName("Geladeira ");
        System.out.println("Produto" + eletrodomestico.getName());
        eletrodomestico.setPrice(1.200);
        System.out.println("Valor" + eletrodomestico.getPrice());
        eletrodomestico.addProducts(5);
        System.out.println("Quantidade: " + eletrodomestico.getQuantity());
        eletrodomestico.setColor("Preta");
        System.out.println("Cor: " + eletrodomestico.getColor());
        System.out.println("Valor total em estoque: " + eletrodomestico.totalValueInStock());


        System.out.println();

        Product mesa = new Product();
        mesa.setName("Mesa de jantar com 4 cadeiras");
        System.out.println("Produto" + mesa.getName());
        mesa.setPrice(7.8);
        System.out.printf("Valor %.4f%n" , mesa.getPrice());
        System.out.println("Quantidade: " + mesa.getQuantity());
        mesa.setColor("Vermelha");
        System.out.println("Cor: " + mesa.getColor());
        System.out.println("Valor total em estoque: " + mesa.totalValueInStock());
        mesa.addProducts(2);
        System.out.println(mesa.getQuantity());
        mesa.removeProducts(4);
        System.out.println(mesa.getQuantity());






    }
}
