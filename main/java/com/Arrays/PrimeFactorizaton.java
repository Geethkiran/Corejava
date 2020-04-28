package com.Arrays;

import java.util.Scanner;

public class PrimeFactorizaton {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		int[] array = new int[50];
		int count = 0;
		int[] primeFactor = new int[20];
		for (int counter1 = 2; (counter1 * counter1) < number; counter1++) {
			while (number % counter1 == 0) {
				primeFactor[count] = counter1;
				number = number / counter1;
				count++;
			}
		}
		for (int i = 0; i < primeFactor.length; i++) {
			if (primeFactor[i] != 0) {
				System.out.print(primeFactor[i] + " ");
			}
		}
	}
}
