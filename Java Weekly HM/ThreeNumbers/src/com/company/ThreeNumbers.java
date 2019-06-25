package com.company;
import java.util.Scanner;

public class ThreeNumbers {


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter 3 different numbers separated by space");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        ///logic
        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.printf("%d %d %d", number1, number2, number3);
            } else if (number3 > number2){
                System.out.printf("%d %d %d", number1, number3, number2);
            }
        }  else if (number1 == number2 || number2 == number3 || number1 == number3){
            System.out.printf("\n%d %d %d   \nsome of the numbers you entered are equal,please choose different numbers.\n", number1, number2, number3);
        }


        if(number2 > number1 && number2 > number3 ){
            if(number1 > number3){
                System.out.printf("%d %d %d", number2, number1, number3);
            }else if(number3 > number1) {
                System.out.printf("%d %d %d", number2, number3, number1);
            }

        }


        if(number3 > number2 && number3 > number1){
            if(number2 > number1){
                System.out.printf("%d %d %d", number3, number2, number1);
            }else if(number1 > number2) {
                System.out.printf("%d %d %d", number3, number1, number2);
            }
        }


    }
}
