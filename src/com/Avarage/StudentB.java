package com.Avarage;

public class StudentB extends Marks{


        double subject1;
        double subject2;
        double subject3;
        double subject4;
        StudentB(double subject1,double subject2,double subject3, double subject4){
            this.subject1=subject1;
            this.subject2=subject2;
            this.subject3=subject3;
            this. subject4=subject4;
        }

        @Override
        double getPercentage() {
            double average= (subject1+subject2+subject3+subject4)/4;
            return  average;
        }
    }

