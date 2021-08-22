package br.com.javaoo.entities;

public class TaxPayer {

    private String name;
    private Double anuallncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anuallncome) {
        this.name = name;
        this.anuallncome = anuallncome;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Double getAnuallncome() {
        return anuallncome;
    }

    public double setAnuallncome(Double anuallncome) {
        this.anuallncome = anuallncome;
        return 0;
    }

    public double tax(Double tax) {
        return tax;
    }
}

