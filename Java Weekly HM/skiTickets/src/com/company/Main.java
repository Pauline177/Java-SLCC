package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // user info
        Scanner input = new Scanner(System.in);
        System.out.print("\nNumber of adults tickets: ");
        int adultTickets = input.nextInt();
        input.nextLine();
        System.out.print("Number of youth tickets: ");
        int youthTickets = input.nextInt();
        input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();

        ///math
        float adultsTotal = adultTickets*93;
        float youthTotal = youthTickets*47;
        float total = adultsTotal+youthTotal;

        ///printing ticket
        System.out.printf("\n\n\nInvoice for %s:\n\n", name);
        System.out.printf("\nAdult Tickets %d .. $ %.2f", adultTickets, adultsTotal);
        System.out.printf("\nYouth Tickets %d .. $ %.2f", youthTickets, youthTotal);
        System.out.print("\n----------------------------");
        System.out.printf("\n\t\t\t\t\t$ %.2f", total);
        System.out.printf("\n%28s", "=========");

    }
}
