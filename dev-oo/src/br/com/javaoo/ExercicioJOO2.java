package br.com.javaoo;

import br.com.javaoo.entities.Rectangle;

import java.util.Locale;

public class ExercicioJOO2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Rectangle retangulo = new Rectangle();

        retangulo.setWidth(3.00);
        retangulo.setHeight(4.00);
        System.out.printf("Area = %.2f%n " , retangulo.area());
        System.out.printf("Perimeter = %.2f%n " , retangulo.perimeter());
        System.out.printf("Diagonal = %.2f%n" , retangulo.diagonal());


    }
}
