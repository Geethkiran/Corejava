package com.ProgramConstructs.Repetition;

public class Gambler {
    public static void main(String[] args) {
        int stake = 100, goal = 200;
        double countwin = 0, countloss = 0;
        while (stake > 0) {
            if (stake == goal) {
                System.out.println("congrats reached todays goal");
                break;
            }
            else {
                double d = Math.random();
                if (d > 0.5) {
                    stake++;
                    System.out.println("congrats you had won");
                    countwin++;
                }
                else {
                    stake--;
                    System.out.println("sorry you losed this time");
                    countloss++;
                }
            }
        }
        System.out.println("win/loss=" + countwin + " " + countloss);
    }
}
