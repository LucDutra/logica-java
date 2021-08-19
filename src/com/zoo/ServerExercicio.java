package com.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ServerExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<String> contribuintes = new ArrayList<>();


        int n = scanner.nextInt();


        for(int i =0; i < n; i++){
            System.out.println("1 - PF ou 2- PJ");
            int pessoa = scanner.nextInt();

            System.out.println("Nome: ");
            String name = scanner.nextLine();

            System.out.println("Renda anual: ");
            double rendaAnual = scanner.nextDouble();





            }

        }


    }
}
