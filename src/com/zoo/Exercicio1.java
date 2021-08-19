package com.zoo;

import com.zoo.entities.Employe;
import com.zoo.entities.OutsourcedEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employe> employeList = new ArrayList<>();
        System.out.println("Enter the number of employees");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + i + " data:");
            System.out.println("Outsourced (y/n)");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.next();
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.println("Value per hour");
            double valuePerHour = scanner.nextDouble();

            if (ch == 'y') {
                System.out.print("Aditional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeList.add(new OutsourcedEmploye(name, hours, valuePerHour, additionalCharge));
            } else {
                employeList.add(new Employe(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.print("Payments: ");

        for (Employe employee : employeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        scanner.close();


    }


}
