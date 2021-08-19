package com.zoo.entities;

public  class Employe {

    private String name;
    private Integer hours;
    private Double  valuePerHour;


    public Employe(){}

    public Employe(String name, Integer hours, double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }


    public Double payment(){
        return this.hours * this.valuePerHour;
    }


}
