package br.com.javaoo.entities;

public class Product {

    //propriedades
    private String name;
    private double price;
    private int quantity;
    private String color;




    // metodos acessores
    //Getters AND SETTERS

    //SET - ENTRA COM OS VALORES
    //GET - INFORMA OS VALORES
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;

    }
               //
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

           //


    public int getQuantity(){
        return quantity;

    }

            //

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public double totalValueInStock(){
        return quantity * price;
    }


    public void addProducts(int quantity){
        if(quantity <0){
            return;
        }
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if (this.quantity < quantity){
            return;
        }
        this.quantity -= quantity;
    }

}
