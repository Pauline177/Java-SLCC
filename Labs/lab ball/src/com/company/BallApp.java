package com.company;

public class BallApp {


    public static void main (String[] args){

        Ball myBall = new Ball();


        System.out.printf("ball size is :%.2f", myBall.getSize());

        myBall.roll();

        myBall.bounce(14);

        myBall.setSize(7);

        double theSize = myBall.getSize();
        //double newSize = theSize+2;

        System.out.printf("\nsize: %.2f", theSize);


    }


}
