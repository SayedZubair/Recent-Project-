package com.google;

public class Circle implements Shape {

    double radius;
    public Circle (double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        double area= radius*radius*3.14;
        return area;
    }

    @Override
    public double calculatePerimiter() {
        double per=radius*2*3.14;
        return per;
    }
}
