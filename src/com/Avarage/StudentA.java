package com.Avarage;

public class StudentA extends Marks{

    double subject1;
    double subject2;
    double subject3;
    StudentA(double subject1,double subject2,double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    double getPercentage() {
        double average= (subject1+subject2+subject3)/3;
        return  average;
    }
}
