package com.zoo.entities;

public abstract class Animal {

    private String nome;
    private String especie;
    protected int idade;
   protected String sexo;


    //Metodo construtuor DEFAULT
    public Animal(){}

    //Metodo construtuor que incializa todos os atributos
    public Animal(String nome, String especie, int idade, String sexo){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.sexo = sexo;
    }

    // metodos acessores
    // GETTER E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract void emitirSom();

    public abstract boolean isAdulto();


}
