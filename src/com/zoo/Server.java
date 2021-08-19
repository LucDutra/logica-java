package com.zoo;

import com.zoo.entities.*;

public class Server {
    public static void main(String[] args) {



        Cachorro animal = new Cachorro("Luck", "Golden ",35,"femea");

        System.out.println("Olá, seu animal é um " + animal.getEspecie()
        + ", o nome dele é " + animal.getNome() + " e tem " + animal.getIdade() + " meses(s) " + "Sexo: "
                + animal.getSexo());

        if(animal.isAdulto()){
            System.out.println("É adultoo");
        }else {
            System.out.println("Filhote");
        }

        animal.emitirSom();

        System.out.println();

        Gato gato = new Gato("Lucy","Persa",12,"Femea");

        System.out.println("Olá, seu animal é um " + gato.getEspecie()
                + ", o nome dele é " + gato.getNome() + " e tem " + gato.getIdade() + " meses(s) " + "Sexo: "
                + gato.getSexo());

        if(gato.isAdulto()){
            System.out.println("É adutlo");
        }else {
            System.out.println("Filhote");
        }


        gato.emitirSom();

        System.out.println();


        Cobra cobra = new Cobra("Jubileu","Casvavel",14,"Femea");

        System.out.println("Olá, seu animal é um " + cobra.getEspecie()
                + ", o nome dele é " + cobra.getNome()+ " e tem " + cobra.getIdade() + " meses(s) " + "Sexo: "
                + cobra.getSexo());

        if(cobra.isAdulto()){
            System.out.println("É adultoo");
        }else {
            System.out.println("Filhote");
        }


        cobra.emitirSom();

        System.out.println();


        Girafa girafa = new Girafa("Girafinha","Alta",52,"Femea");

        System.out.println("Olá, seu animal é um " + girafa.getEspecie()
                + ", o nome dele é " + girafa.getNome()+ " e tem " + girafa.getIdade() + " meses(s) " + "Sexo: "
                + girafa.getSexo());

        if(girafa.isAdulto()){
            System.out.println("É adultoo");
        }else {
            System.out.println("Filhote");
        }
    }





}
