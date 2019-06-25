import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.print("enter number: ");
        int n1 = input.nextInt();

        System.out.print("enter number: ");
        int n2 = input.nextInt();

        int all = n1 + n2;
        System.out.printf("the sum of the numbers is %d \n", all);

        if (n1 == n2)
        {
            System.out.printf("%d is the same as %d", n1,n2);
            System.out.print(" \n it is true");
        }

        if (n1 != n2)
        {
            System.out.printf("%d is not the same as %d", n1,n2);
        }


    }
}
