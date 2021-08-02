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


        Product eletrodomestico = new Product();
        eletrodomestico.setName("Geladeira Preta");
        eletrodomestico.setPrice(1.200);
        eletrodomestico.setQuantity(2);




        System.out.println(eletrodomestico.getName());
        System.out.println(eletrodomestico.getPrice());
        System.out.println(eletrodomestico.getQuantity());


        Product mesa = new Product();
        mesa.setName("Mesa de jantar com 4 cadeiras");
        mesa.setPrice(7.8);
        mesa.setQuantity(5);

        System.out.println(mesa.getName());
        System.out.printf("%.4f%n", mesa.getPrice());
        System.out.println(mesa.getQuantity());

    }
}
