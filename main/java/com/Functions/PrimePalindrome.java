package com.Functions;

import java.util.Scanner;

public class PrimePalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            int palindromeNumber = getPalindrome(number);

            if (palindromeNumber == number) {

                if (isPrime(palindromeNumber))
                    System.out.println("palindrome Number Is Also Prime Number");
                else
                    System.out.println("palindrome Number Is Not Prime Number");
            } else
                System.out.println("Prime Number Is Not A palindrome Number");
        } else
            System.out.println("Not A Prime Number");
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int getPalindrome(int num) {
        int reverseNumber = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num = num / 10;
        }
        return reverseNumber;
    }
}