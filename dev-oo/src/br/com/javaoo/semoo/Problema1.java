package br.com.javaoo.semoo;

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

        double  valorTotal = 0;
        double  quantidadeTotal = 0;
        int sim = 0;

        System.out.println("Nome: ");
        String y = scanner.nextLine();

        System.out.println("Preco: ");
        double preco = scanner.nextDouble();
        valorTotal = preco;

        System.out.println("Quantidade no estoque: ");
         int quantidade = scanner.nextInt();
         quantidadeTotal = quantidade;


        System.out.println("Nome = " + y);
        System.out.println("Preço = " + preco);
        System.out.println("Quantidade = " + quantidade);
        System.out.println("Valor total no estoque = " + preco );

        System.out.println("Fazer uma entrda no estoque?  1 = Sim, 2= Não");
        sim = scanner.nextInt();
        if( sim == 1){
            System.out.println("Informe o nome do produto: ");
            String x = scanner.nextLine();
            System.out.println("Preco: ");
            preco = scanner.nextDouble();
            valorTotal = valorTotal + preco;
            System.out.println("Quantidade: ");
            quantidade = scanner.nextInt();
            quantidadeTotal = quantidadeTotal + quantidade;
        }else{
            System.out.println("Informe o nome do produto: ");
            String x = scanner.nextLine();
            System.out.println("Preco: ");
            preco = scanner.nextDouble();
            valorTotal = valorTotal - preco;
            System.out.println("Quantidade: ");
            quantidade = scanner.nextInt();
            quantidadeTotal = quantidadeTotal - quantidade;
        }


    }
}
