package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 1; i <= 100; i++) {
            int number = rand.nextInt(4)+4;
            System.out.printf("%-5d", number);
            if (i % 10 == 0) {
                System.out.println();
            }

        }

        System.out.println("\n\n");


        for (int j = 1; j <= 100; j++) {
            int num = rand.nextInt(9)*10+10;
            System.out.printf("%-5d", num);
            if (j % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\n");


        for (int j = 1; j <= 100; j++) {
            int num = rand.nextInt(99)+901;
            System.out.printf("%-5d", num);
            if (j % 10 == 0) {
                System.out.println();
            }
        }


    }
}
