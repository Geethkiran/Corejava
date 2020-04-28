package com.ProgramConstructs.Selection;

import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        System.out.println("Enter 1 to convert feet to inch");
        System.out.println("Enter 2 to convert feet to meter");
        System.out.println("Enter 3 to convet inch to feet");
        System.out.println("Enter 4 to convert meter to feet");
        System.out.println("Enter your value here ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Enter the value that you want to convert ");
        int value = scan.nextInt();
        int inchToFeet = 12;
        double feetToMeter = 0.3048;
        switch (choice) {
            case 1:
                System.out.println("Feet to Inch : " + (inchToFeet * value));
                break;
            case 2:
                System.out.println("Feet to Meter : " + (value * feetToMeter));
                break;
            case 3:
                System.out.println("Inch to Feet : " + (value / inchToFeet));
                break;
            case 4:
                System.out.println("Meter to feet : " + (value / feetToMeter));
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + choice);
        }
    }
}
