package br.com.javaoo.entities;

public class Company extends  TaxPayer{

    private int numberOfEmplyoees;

    public Company() {
    }

    public Company(String name, Double anuallncome, int numberOfEmplyoees) {
        super(name, anuallncome);
        numberOfEmplyoees = numberOfEmplyoees;
    }

    public int getNumberOfEmplyoees() {
        return numberOfEmplyoees;
    }

    public void setNumberOfEmplyoees(int numberOfEmplyoees) {
        this.numberOfEmplyoees = numberOfEmplyoees;
    }

    @Override
    public double tax(Double tax){
        if(numberOfEmplyoees < 10){
            tax =  (1.14 * this.getAnuallncome() - this.getAnuallncome());
        }else{
            tax = (1.16 * this.getAnuallncome() - this.getAnuallncome()) ;
        }
        return tax;
    }

}
