public class Formatacao {

    public static void main(String[] args) {

        double x = 10.35784;

        // imprimi o texto SEM uma nova linha
        System.out.print(x);

        // imprimi o texto COM uma nova linha
        System.out.println(x);

        // imprimi o valor e formata a saida
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);


    }

}
