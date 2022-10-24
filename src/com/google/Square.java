package com.google;

public class Square implements Shape{

    double width;
    double height;

   public Square (double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateArea() {
        double area= width*height;
        return area;
    }

    @Override
    public double calculatePerimiter() {
        double per = width*2+height*2;
        return per;
    }
}
