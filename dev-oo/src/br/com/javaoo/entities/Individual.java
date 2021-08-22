package br.com.javaoo.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        healthExpenditures = healthExpenditures;
    }


    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(Double tax) {
        if (getAnuallncome() < 20000) {
            tax = (1.15 * this.getAnuallncome() - this.getAnuallncome());
        } else {
              tax = ((1.25  * this.getAnuallncome()) + (1.50 * this.getHealthExpenditures())
                     - this.getAnuallncome()) ;
        }
        return tax;
    }

}
