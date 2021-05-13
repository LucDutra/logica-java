import java.util.Scanner;

    /*
Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo.
 Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após
  resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

Exemplos de Entrada	Exemplos de Saída
Ex de Entrada   Ex de saida
10              X = 19
9

Ex de Entrada   Ex de saida
-10             X = -6
4

Ex de Entrada   Ex de saida
15              X = 8
-7


 */

import java.util.Scanner;
public class Ex1001 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = a + b;


            System.out.println("X = " + x);


                scanner.close();







        }



    }



