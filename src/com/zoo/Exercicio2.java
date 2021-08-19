package com.zoo;

import com.zoo.entities.ImportProduct;
import com.zoo.entities.Product;
import com.zoo.entities.UsedProduct;
import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        System.out.println("Numero de produtos: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Product " + i + "Data: ");
            System.out.println("Common, used or imported: c/u/i");
            char pd = scanner.next().charAt(0);

            if(pd == 'c'){
               String comum = scanner.next();
               double pcomum = scanner.nextDouble();
            }
            if(pd == 'i'){
                double customsFee = scanner.nextDouble();
                productList.add(new ImportProduct(name,price,customsFee));
            }
            if(pd == 'u'){
                String x = scanner.next();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date manufcatureDate = new Date();
                productList.add(new UsedProduct(name,manufcatureDate));

            }

            System.out.println();

            for(Product product : productList){
                System.out.println("Name: " + product.getName() + "Price: " +
                        String.format("%.2f", product.getPrice()));
            }



        }

        scanner.close();
    }
}
