package com.Arrays;

import java.util.Arrays;
import java.util.Random;

public class SortedSecondMinMax {
	public static void main(String[] args) {
		Random random = new Random();
		int[] randomNum = new int[10];
		for (int i = 0; i < 10; i++) {
			randomNum[i] = random.nextInt(899) + 100;
		}
		System.out.println(Arrays.toString(randomNum));
		int temp=0;
		for (int i = 0; i < randomNum.length; i++) {
			for (int j = i+1; j < randomNum.length; j++) {
				if (randomNum[i]>=randomNum[j]) {
					temp = randomNum[i];
					randomNum[i]=randomNum[j];
					randomNum[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(randomNum));
		System.out.println("Second Largest Number is : "+randomNum[1]);
		System.out.println("Second Smallest Number is : "+randomNum[8]);
	}
}
