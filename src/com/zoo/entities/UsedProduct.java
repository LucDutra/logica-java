package com.zoo.entities;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct(){
        super();
    }


    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name,price);
        manufactureDate = manufactureDate;
    }

    public Date getManufactureDate(Date manufactureDate) {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return null;
    }
}
