package com.company;


public class Ball {

    private double size =5;

    public double getSize(){
        return size;

    }

    public void setSize(double s){

        if(s >= 0){
            size = s;
        }
    }

    public void roll(){

        System.out.print("\nrolling");
    }

    public void bounce(int numberOfBounces){

        System.out.printf("\nBouncing %d times", numberOfBounces);
    }

}
