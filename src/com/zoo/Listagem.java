package com.zoo;

/*
-Estruta de dado porem mais flexivel
-Homogenea
-Ordenada
-Pode ser inicializada vazia
-Cada elemento é um NÓ


    Vantagens

        TAMANHO FLEXIVEL

   Desvantagens

        Elementos alocados em sequencia
 */

import java.util.ArrayList;
import java.util.List;

public class Listagem {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Rafael");
        listaNomes.add("Stefanie");
        listaNomes.add("Victor");
        listaNomes.add("Lucas");
        listaNomes.add("Tiago");

/*
        //Padrao

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }


        PADRAO CORRETO

         for (String itemLista: listaNomes) {
            System.out.println(itemLista);
        }



        System.out.println();

        //Aumenta a listagem
        listaNomes.add(2, "Outro nome");
        for (String itemLista : listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println();

        //Diminuindo a listagem
        listaNomes.remove(2);
        for (String itemLista : listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println();

        // Predicao
        listaNomes.removeIf(x -> x.charAt(0) == 'L');

        System.out.println("Lista - Condicao");
        for (String itemLista : listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println();

        //Como percorrer uma lista
        System.out.println("Qual a posicao do Tiago " + listaNomes.indexOf("Tiago"));

        System.out.println();
*/
        listaNomes.forEach(nomeDaLista -> System.out.println(nomeDaLista));

        System.out.println();


        System.out.println("***** Nome pesquisado *******");
        String nomeFiltrado = listaNomes.stream().filter(condicao -> condicao.charAt(0) == 'S').findFirst()
                .orElse(null);

        System.out.println(nomeFiltrado);
    }
}
