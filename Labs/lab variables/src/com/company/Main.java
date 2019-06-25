package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String inputText = input.nextLine();


        System.out.println("Favorite destination: " + inputText );
        System.out.print("\n Welcome to " + inputText);

        int number1 = 4124;
        int number2 = 3581;

        System.out.printf("\n\nElevation of Kings Peak: %d", number1);
        System.out.printf("\nElevation of Timponogos: %d", number2);

    }

}