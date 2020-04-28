package com.ProgramConstructs.Selection;

import java.util.Scanner;

public class UnitsPlace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        String value = scan.next();
        if (value.length() == 1)
            System.out.println("Units");
        else if (value.length() == 2)
            System.out.println("Tens");
        else if (value.length() == 3)
            System.out.println("Hundreds");
        else if (value.length() == 4)
            System.out.println("Thousands");
        else if (value.length() == 5)
            System.out.println("Ten-Thousand");
        else
            System.out.println("Infinity");
    }
}