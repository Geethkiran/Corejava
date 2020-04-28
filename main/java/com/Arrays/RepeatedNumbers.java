package com.Arrays;

import java.util.Arrays;

public class RepeatedNumbers {
	public static void main(String[] args) {
		
		int[] repeated = new int[9];
		int count=0;
		for (int i = 1; i <= 100; i++) {
			if (i%11 == 0) {
				repeated[count] = i;
				count++;
			}
		}
		System.out.println(Arrays.toString(repeated));
	}
}
