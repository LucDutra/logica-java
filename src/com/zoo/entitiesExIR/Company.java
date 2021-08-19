package com.zoo.entitiesExIR;

public class Company extends TaxPayer{

    private int numberOfEmployees;


    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
}
