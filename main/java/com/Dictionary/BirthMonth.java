package com.Dictionary;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

public class BirthMonth {
    public static void main(String[] args) {
        Dictionary<Integer, Integer> hash = new Hashtable<Integer, Integer>();

        for (int i = 1; i <= 12; i++) {
            hash.put(i, 0);
        }

        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            int value = (random.nextInt(12) + 1);
            hash.put(value, (hash.get(value) + 1));
        }
        System.out.println(hash);
    }
}
