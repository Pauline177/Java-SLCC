package com.company;

public class Main {

    public static void main(String[] args) {

	int num = 1;
	    while(num <= 25) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("hoppety hop");
            } else if (num % 3 == 0) {
                System.out.println("hoppety");
            } else if (num % 5 == 0) {
                System.out.println("hop");
            } else {
                System.out.println(num);
            }
            num++;
        }


    }
}
