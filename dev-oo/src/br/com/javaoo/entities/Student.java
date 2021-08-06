package br.com.javaoo.entities;

import jdk.swing.interop.SwingInterOpUtils;

import java.security.PrivateKey;

public class Student {

    private String name;
    private double nota1;
    private double nota2;
    private double nota3;



    public void setName (String name){
        this.name = name;
    }


    public void setNota1 (double nota1){
        this.nota1 = nota1;
    }


    public void setNota2 (double nota2){
        this.nota2 = nota2;
    }


    public void setNota3 (double nota3){
        this.nota3 = nota3;
    }

    public double somaNotas(){
        return nota1 + nota2 + nota3;
    }

    public double faltaPonto(){
        if(somaNotas() < 60.0){
            return 60.0 - somaNotas();
        }else {
            return 0.0;
        }
    }

    public void statusAluno(){
        if(somaNotas() < 60.0){
            System.out.println("Reprove");
            System.out.printf("Faltam: %.2f%n", faltaPonto());
        }else {
            System.out.println("PASS");
        }
    }


}
