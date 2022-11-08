package com.bridgelabz;

import java.util.Scanner;
public class MonthlyPayment {

    public static void main(String arg[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal loan Amount : ");
        double P = scan.nextDouble();

        System.out.print("Enter percent Interest : ");
        double r = scan.nextDouble();
        r = r /(12*100);

        System.out.print("Enter years To Pay off : ");
        int Y = scan.nextInt();
        Y = 12 * Y;

        double payment = (P * r) / (1 - Math.pow(1 + r, -Y));
        System.out.println("Payment due: " + payment);
    }
}
