package com.Avarage;

public class Tester {
    public static void main(String[] args) {
        StudentA studentA=new StudentA(89,78,90);
        System.out.println(studentA.getPercentage());
        StudentB studentB=new StudentB(89,78,90,98);
        System.out.println(studentB.getPercentage());
    }
}
