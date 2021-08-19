package com.zoo.entities;

public class OutsourcedEmploye extends Employe{

    public Double additionalCharge;

    public OutsourcedEmploye(){
        super();
    }

    public OutsourcedEmploye(String name, Integer hours, double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
     additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() * 1.1;
    }
}
