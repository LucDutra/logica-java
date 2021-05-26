public class OperadoresComparacao {

    public static void main(String[] args) {

        boolean menorQue = 5 < 10;
        boolean maiorQue = 5 > 10;
        boolean menorIgual = 5 <= 10;
        boolean maiorIgual = 5 >= 10;
        boolean igualdade = 5 ==10;
        boolean diferente = 5 != 10;

       // MENOR QUE
        System.out.println("MENOR QUE -> " +  menorQue);
        // MAIOR QUE
        System.out.println("MAIOR QUE -> " + maiorQue);
        // MENOR OU IGUAL A QUE
        System.out.println("MENOR OU IGUAL QUE -> " + menorIgual);
        //MAIOR OU IGUAL A QUE
        System.out.println("MAIOR OU IGUAL QUE -> " + maiorIgual);
        // IGUALDADE
        System.out.println("IGUALDADE -> " + igualdade);
        // DIFERENTE
        System.out.println("Diferente -> " + diferente);


        System.out.println( "-----------------------------------------------------------------------");

        int x = 5;
        System.out.println(x > 0 ); // true
        System.out.println(x == 3); // false
        System.out.println(10 <= 30 ); // true
        System.out.println( x != 2); // true

        System.out.println( "--------------------OPERADORES LOGICOS  --- AND ou E ---------------------------");

        System.out.println(x <= 20 && x == 10); // false
        System.out.println(x > 0 && x != 3); // true
        System.out.println(x <= 20 && x == 10 && x != 3); // false



        System.out.println( "--------------------OPERADORES LOGICOS  --- OR ou OU ---------------------------");

        System.out.println(x <= 20 || x == 10);  // True
        System.out.println(x > 0 || x != 3); // true
        System.out.println(x <= 20 || x == 10 || x != 3); // true


        System.out.println( "--------------------OPERADORES LOGICOS  --- NÃO ou NOT ---------------------------");

        System.out.println (!(x >= 2)); // False
        System.out.println (!(x == 10));// true

    }
}
