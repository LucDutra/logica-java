package br.com.javaoo.entities;

public class Rectangle {

    private double width;
    private double height;


    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public  double area(){
        return  width * height;
    }

    public double perimeter(){
        return (width * 2) + (height *2);
    }
    public double diagonal(){
        return Math.sqrt(1 + (Math.pow(2, width) + Math.pow(2,height)));
    }

}
