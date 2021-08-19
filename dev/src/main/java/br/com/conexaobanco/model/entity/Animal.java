package br.com.conexaobanco.model.entity;

public class Animal {

    private String name;
    private String especie;
    protected int idade;
    protected String sexo;

    public Animal(){

    }

    public Animal(String name, String especie, int idade, String sexo) {
        this.name = name;
        this.especie = especie;
        this.idade = idade;
        this.sexo = sexo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
