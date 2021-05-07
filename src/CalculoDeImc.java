import java.util.Scanner;

public class CalculoDeImc {


    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

                //***ENTRADA DE DADOS***//
                System.out.println("Digite sua altura: ");
                double alturaUsuario = scanner.nextDouble();

                System.out.println("Digite seu peso: ");
                double pesoUsuario = scanner.nextDouble();

                //***PROCESSAMENTO***//
                double resultado = pesoUsuario / (alturaUsuario * alturaUsuario);

                //***SAIDA DE DADOS***//
                System.out.println("O imc é: " + resultado);


    }
}
