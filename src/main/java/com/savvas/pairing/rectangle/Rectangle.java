package com.savvas.pairing.rectangle;

public class Rectangle implements RectangleInterface{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getPerimeter(){
        return (2*width)+(2*length);
    }

    public double getArea(){
        return width*length;
    }
}
