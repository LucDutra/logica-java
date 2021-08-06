package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class Exercio2SEMOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        double width = 3.00;
        double height = 4.00;
        double area = width * height;
        double perimeter = (width * 2) + (height *2);
        double diagonal =  Math.sqrt(1 + (Math.pow(2, width) + Math.pow(2,height)));

        System.out.println("Enter rectangle width and height: ");
        System.out.println(width);
        System.out.println(height);
        System.out.printf("Area = %.2f%n " , area);
        System.out.printf("Perimeter = %.2f%n " , perimeter);
        System.out.printf("Diagonal = %.2f%n" , diagonal);


    }
}
