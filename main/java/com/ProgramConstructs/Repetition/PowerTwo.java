package com.ProgramConstructs.Repetition;

import java.util.*;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Exponent-->");
        int exponent = sc.nextInt();
        int base = 2;
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Result is = " + result);
    }
}