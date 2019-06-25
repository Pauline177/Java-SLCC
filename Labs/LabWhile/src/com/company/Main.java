package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        multiplyNumbers();

    }


    public static void multiplyNumbers()
    {
       int product = 1;

       Scanner input = new Scanner(System.in);
       System.out.print("enter a number or 0 to quit: ");
       int number = input.nextInt();

       while(number != 0){
           product = number * product;

           System.out.print("enter a number or 0 to quit: ");
           input = new Scanner(System.in);
           number = input.nextInt();

        }

       System.out.printf("final result: %d", product);

       }

}
