import java.util.Locale;
import java.util.Scanner;

public class ImcIF {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.4) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.8) {
            System.out.println("Normal");
        } else if (imc >= 24.9 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30.0) {
            System.out.println("Obesidade");
        }

        scanner.close();

    }
}
