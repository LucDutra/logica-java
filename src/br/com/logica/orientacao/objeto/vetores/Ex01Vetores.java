package br.com.logica.orientacao.objeto.vetores;

import java.util.Scanner;

public class Ex01Vetores {
    /*
    Fazer um programa para ler um numero inteiro positivo N, depois de ler N numeros
    quaisquer e armazena-los em um vetor. Em seguida, mostrar na tela todos elementos do vetor.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        // Entrada de valores
        for (int i = 0; i < quantidade; i++){
            numeros[i] = scanner.nextInt();
        }

        // imprime os valores
        for (int i = 0 ; i < quantidade; i++){
            System.out.println(numeros[i]);
        }

    }
}
