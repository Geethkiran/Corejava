package com.ProgramConstructs.Selection;

import java.util.Random;

public class RandomFiveDigitMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = (random.nextInt(899) + 100);
        int random2 = (random.nextInt(899) + 100);
        int random3 = (random.nextInt(899) + 100);
        int random4 = (random.nextInt(899) + 100);
        int random5 = (random.nextInt(899) + 100);
        double max = 0;

        if (random1 >= random2 && random1 >= random3 && random1 >= random4 && random1 >= random5) {
            max = random1;
        } else if (random2 >= random1 && random2 >= random3 && random2 >= random4 && random2 >= random5) {
            max = random2;
        } else if (random3 >= random2 && random3 >= random3 && random3 >= random4 && random3 >= random5) {
            max = random3;
        } else if (random4 >= random2 && random4 >= random3 && random4 >= random1 && random4 >= random5) {
            max = random4;
        } else {
            max = random5;
        }
        System.out.println("Maximum is : " + max);
        double min = max;
        if (random1 <= random2 && random1 <= random3 && random1 <= random4 && random1 <= random5) {
            min = random1;
        } else if (random2 <= random1 && random2 <= random3 && random2 <= random4 && random2 <= random5) {
            min = random2;
        } else if (random3 <= random2 && random3 <= random1 && random3 <= random4 && random3 <= random5) {
            min = random3;
        } else if (random4 <= random2 && random3 <= random1 && random3 <= random4 && random3 <= random5) {
            min = random4;
        } else {
            min = random5;
        }
        System.out.println("Minimum is : " + min);
    }
}