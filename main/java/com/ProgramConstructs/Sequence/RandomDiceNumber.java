package com.ProgramConstructs.Sequence;

import java.util.Random;

public class RandomDiceNumber {
    public static void main(String[] args) {
        Random dice = new Random();
        System.out.println((dice.nextInt(6) + 1));
    }
}
