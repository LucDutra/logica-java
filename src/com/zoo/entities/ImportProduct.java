package com.zoo.entities;

import java.text.SimpleDateFormat;

public class ImportProduct extends Product {


    private Double customFee;

    public ImportProduct() {
        super();
    }

    public ImportProduct(String name, Double price, Double customFee){
        super(name,price);
        this.customFee = customFee;
    }




}



