package br.com.logica.orientacao.objeto.vetores;

public class Vetores {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        String[] nomes = new String[3];
        char[] letra = new char [3];

        numeros[1] = 21;
        numeros[0] = 20;
        numeros[2] = 34;
        nomes[1] = "Lucas";
        nomes[0] = "Larissa";
        nomes[2] = "Thiago";
        letra[0] = 'a';
        letra[1] = 'b';
        letra[2] = 'c';


        for(int i =0; i<3; i++){
            System.out.println("Qual o valor?  " + letra[i]);

        }

        /*              OUTRO EXEMPLO
        System.out.println("Qual é a idade das pessoas? " + numeros[1] + " " + numeros[0] + " " + numeros[2]);
        System.out.println("Qual é o nome das pessoas? ");
        System.out.println(nomes[1]);
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);

         */
    }



}
