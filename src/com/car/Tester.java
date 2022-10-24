package com.car;

import org.w3c.dom.ls.LSOutput;

public class Tester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(12000,"Black",15);
        System.out.println(sedan.calculateSalePrice());

        Truck truck =new Truck(20000,"red",19999);
        System.out.println(truck.calculateSalePrice());
    }




}
