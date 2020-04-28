package com.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TripletesZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elemets");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        findTriplets(array);
    }

    public static int findTriplets(int[] array) {
        int count = 0;
        if (array.length <= 0) {
            throw new InputMismatchException("Input mismatched re-enter Again");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] != array[j] && array[j] != array[k] && array[i] != array[k]
                            && array[i] + array[j] + array[k] == 0) {
                        count++;
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }
        return count;
    }
}
