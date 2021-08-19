package com.zoo.entitiesExIR;

public class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;


    }

    public void tax(double tax){
    };

}
