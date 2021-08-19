package com.zoo.entities;

public class Girafa extends  Animal{

    public Girafa(){

    }

    public Girafa(String nome, String especie, int idade, String sexo){
        super(nome,especie,idade,sexo);

    }

    @Override
    public void emitirSom() {

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
