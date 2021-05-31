package Lab1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int x, y;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the First Number to be sum: ");
        x = scn.nextInt();
        System.out.print("Enter the Second Number to be sum: ");
        y = scn.nextInt();

        System.out.println("The Entered two numbers are " + x + " and " + y);
        System.out.println("And their Sum is " + (x+y));
    }
}
