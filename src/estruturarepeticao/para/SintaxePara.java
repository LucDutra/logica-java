package estruturarepeticao.para;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SintaxePara {

    /*
        Fazer um programa que le um numero de valores inteiros N. ao final mostrar a soma dos numero N lidos.


     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int cont = 0;
        int soma = 0;
        int continuacao = 0;

        while (N >= 0 && continuacao != 2){
            int N1 = scanner.nextInt();
            soma += N1;
            cont++;
            System.out.println("Deseja continuar: 1 - Nao  2 - Sim");
           continuacao = scanner.nextInt();
        }


        System.out.println(soma);


        scanner.close();
    }
}
