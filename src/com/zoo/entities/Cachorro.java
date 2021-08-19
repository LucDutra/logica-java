package com.zoo.entities;

public class Cachorro extends Animal{


    public Cachorro() {
    }

    public Cachorro(String nome, String especie, int idade, String sexo) {
        super(nome, especie, idade,sexo);

    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }


    @Override
    public  boolean isAdulto(){
        if(this.sexo.equalsIgnoreCase("femea") &&
                (this.idade > 36 && this.idade <47)){
            return true;
        }
        return false;
    }

}
