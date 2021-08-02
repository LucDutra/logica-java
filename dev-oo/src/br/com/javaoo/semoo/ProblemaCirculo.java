package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);




        System.out.println("Informe o raio: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("A area do circulo é: " + area);


        scanner.close();
    }
}
