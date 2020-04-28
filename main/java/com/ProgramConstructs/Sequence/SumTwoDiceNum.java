package com.ProgramConstructs.Sequence;

import java.util.Random;

public class SumTwoDiceNum {
    public static void main(String[] args) {
        Random dice = new Random();
        int dice1 = (dice.nextInt(6) + 1);
        int dice2 = (dice.nextInt(6) + 1);
        System.out.println("Dice 1 : " + dice1);
        System.out.println("Dice 2 : " + dice2);
        System.out.println("Sum of 2 Dices is : " + (dice1 + dice2));
    }
}