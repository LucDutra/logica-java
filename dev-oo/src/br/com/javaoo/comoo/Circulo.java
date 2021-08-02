package br.com.javaoo.comoo;

public class Circulo {

    public double raio;

    public void calculaArea(){
        double area = Math.PI * Math.pow(raio,2);
        System.out.println("A area do circulo é: " + area);

    }

}
