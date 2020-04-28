package com.ProgramConstructs.Selection;

import java.util.Scanner;

public class WeekDayDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Input");
        int digit = scan.nextInt();
        if (digit == 1)
            System.out.println("Sunday");
        else if (digit == 2)
            System.out.println("Monday");
        else if (digit == 3)
            System.out.println("Tuesday");
        else if (digit == 4)
            System.out.println("Wednesday");
        else if (digit == 5)
            System.out.println("Thursday");
        else if (digit == 6)
            System.out.println("Friday");
        else if (digit == 7)
            System.out.println("Saturday");
        else
            System.out.println("Unexpected value: " + digit);
    }
}