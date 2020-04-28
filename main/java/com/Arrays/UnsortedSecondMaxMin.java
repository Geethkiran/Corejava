package com.Arrays;

import java.util.Arrays;
import java.util.Random;

public class UnsortedSecondMaxMin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNum = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNum[i] = random.nextInt(899) + 100;
        }
        System.out.println(Arrays.toString(randomNum));
        int max = 0;
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] >= max) {
                max = randomNum[i];
            }
        }
        int secondMax = 0;
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] >= secondMax && randomNum[i] != max) {
                secondMax = randomNum[i];
            }
        }
        System.out.println("Second Max random Number is : " + secondMax);
        int min = max;
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] <= min) {
                min = randomNum[i];
            }
        }
        int secondMin = max;
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] <= secondMin && randomNum[i] != min) {
                secondMin = randomNum[i];
            }
        }
        System.out.println("Second Min random Number is : " + secondMin);
    }
}
