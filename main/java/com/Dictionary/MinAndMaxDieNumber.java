package com.Dictionary;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

public class MinAndMaxDieNumber {
    public static void main(String[] args) {

        Dictionary<Integer, Integer> hash = new Hashtable<Integer, Integer>();

        for (int i = 1; i <= 6; i++) {
            hash.put(i, 0);
        }

        while (hash.get(1) != 10 && hash.get(2) != 10 && hash.get(3) != 10 && hash.get(4) != 10 && hash.get(5) != 10
                && hash.get(6) != 10) {
            Random random = new Random();
            int value = (random.nextInt(6) + 1);
            hash.put(value, (hash.get(value) + 1));
        }

        System.out.println(hash);
        int minimum = 10;
        int position = 0;
        for (int i = 1; i <= hash.size(); i++) {
            if (hash.get(i) <= minimum) {
                minimum = hash.get(i);
                position = i;
            }
        }
        System.out.println("The minimum times of repeated Dice is : " + position);
        int maximum = minimum;
        for (int i = 1; i <= hash.size(); i++) {
            if (hash.get(i) >= maximum) {
                maximum = hash.get(i);
                position = i;
            }
        }
        System.out.println("The maximum times of repeated Dice is : " + position);
    }
}
