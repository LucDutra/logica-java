package br.com.logica.orientacao.objeto.vetores;

public class ExNaMao1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = (a+b) / 2;
        int d = c - 40;
        int[] resultado = new int[4];

        resultado[3] = a+b+c;

        System.out.println(resultado[3]);
    }
}
