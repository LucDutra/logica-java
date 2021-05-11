import java.util.Locale;
import java.util.Scanner;
// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
public class Concatenacao{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Criar mensagem que solicita ao usuario o nome e a idade//

        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.printf("o meu nome é %s e tenho %d anos, minha altura é %.2f e meu peso é %.2fn", nome, idade, altura, peso);

        scanner.close();

    }

}
