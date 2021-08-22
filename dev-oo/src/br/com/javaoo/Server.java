package br.com.javaoo;

import br.com.javaoo.entities.Company;
import br.com.javaoo.entities.Individual;
import br.com.javaoo.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<TaxPayer> listaContribuintes = new ArrayList<>();
        List<TaxPayer> listaContribuintes2 = new ArrayList<>();

        for(int i = 0; n > i; i++){
            System.out.println("Para PF digite: 1   Para PJ digite: 2");
            int contribuinte = scanner.nextInt();


            if (contribuinte == 1){

                System.out.println("Nome: ");
                String name = scanner.next();

                System.out.println("Salario anual: ");
                double anuallncome = scanner.nextDouble();

                System.out.println("Gastos medicos");
                double healthExpenditures = scanner.nextDouble();

                listaContribuintes.add(new Individual(name,anuallncome,healthExpenditures));



            }else{
                System.out.println("Nome: ");
                String name = scanner.next();
                System.out.print(" ");
                System.out.println();

                System.out.println("Salario anual: ");
                double anuallncome = scanner.nextDouble();

                System.out.println();

                System.out.println("Numeros de funcionarios");
                int numberOfEmployes = scanner.nextInt();

                listaContribuintes2.add(new Company(name,anuallncome,numberOfEmployes));

            }
        }

        System.out.println();

        for (TaxPayer Individual: listaContribuintes) {
            System.out.println(Individual.getName()+ " " + Individual.getAnuallncome() + " " +
                    Individual.tax(Individual.getAnuallncome()));
        }

        for (TaxPayer Company: listaContribuintes2){

            System.out.println(Company.getName() + " "+ Company.getAnuallncome() + " "+ Company.tax
                    (Company.getAnuallncome()));

        }
        scanner.close();

    }
}
