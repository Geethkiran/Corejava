package com.ProgramConstructs.Selection;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Random toss = new Random();
        if (toss.nextInt() >= 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}
