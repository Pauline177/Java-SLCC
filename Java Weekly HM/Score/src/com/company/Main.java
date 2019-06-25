// Pauline Makoma.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first team's score: ");
        int s1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter the name of the first team: ");
        String t1 = input.nextLine();



        System.out.print("Enter the second team's score: ");
        int s2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter the name of the second team: ");
        String t2 = input.nextLine();

        ////logic
        if(s1 > s2){
            System.out.printf("%s is the winner", t1);
        } else if (s2 > s1){
            System.out.printf("%s is the winner", t2);
        }

    }
}
