package br.com.logica.orientacao.objeto.vetores;

public class ExNaMao3 {
    public static void main(String[] args) {
        int a = 7;
        int b = a - 6;
        while (b <a){
            int[] v = new int[b];
            int c = b*a;
            b = b+2;
            System.out.println(c);
        }
    }
}
