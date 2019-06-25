package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.print("what's the first color: ");
        String color1 = info.nextLine();

        System.out.printf(" \nhow many %s are there: ", color1);
        int number1 = info.nextInt();
        info.nextLine();

        System.out.print(" \nwhat's the second color: ");
        String color2 = info.nextLine();

        System.out.print(" \nhow many "+ color2 +" are there: ");
        int number2 = info.nextInt();
        info.nextLine();

        System.out.print(" \nwhat's the third color: ");
        String color3 = info.nextLine();

        System.out.print("\n how many " + color3 +" are there: ");
        int number3 = info.nextInt();

        System.out.println("color \t\t number of marbles");

        System.out.print("------ \t\t ---------------");
        System.out.printf("\n%s \t\t%d", color1, number1);
        System.out.printf("\n%s \t%d ", color2, number2);
        System.out.printf("\n%s \t\t%d ", color3, number3);
    }
}
