package com.zoo.entitiesExIR;

public class Individual extends TaxPayer{

    private Double healthExpenditures;


    public Individual(){
        super();
    };

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
}
