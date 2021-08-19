package com.zoo.entities;

public class Cobra extends Animal{

    public Cobra(){

    }

    public Cobra(String nome, String especie, int idade, String sexo){
        super(nome,especie,idade,sexo);

    }

    @Override
    public void emitirSom() {
        System.out.println("Chocalhar");
    }

    @Override
    public boolean isAdulto(){
        return super.getIdade() >=12;
    }

}
