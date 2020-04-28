package com.ProgramConstructs.Sequence;

import java.util.Random;

public class RandomSingleDigit {
    public static void main(String[] args) {
        Random dice = new Random();
        System.out.println((dice.nextInt(9) + 1));
    }
}