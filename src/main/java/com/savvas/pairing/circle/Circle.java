package com.savvas.pairing.circle;


public class Circle implements CircleInterface {

    private double radius;
    private double valueOfP = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return valueOfP * (radius*radius);
    }
    public double getPerimeter(){ //circumference
        return 2*valueOfP*radius;
    }
}
