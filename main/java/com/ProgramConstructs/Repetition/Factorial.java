package com.ProgramConstructs.Repetition;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number n");
        long n = scan.nextLong();
        System.out.print(Factorial(n));
    }

    private static long Factorial(Long n) {

        long factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;

        }
        return factor;

    }
}