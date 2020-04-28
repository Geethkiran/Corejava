package com.ProgramConstructs.Repetition;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int chead = 0, ctail = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter how many times you need to flip the coin");
        int t = scn.nextInt();
        if (t <= 0) {
            System.out.println("coin not flipped");
        } else {

            while (t > 0) {
                double d = Math.random();
                if (d < 0.5) {
                    chead++;
                } else {
                    ctail++;
                }
                t--;
            }
        }
        System.out.println("head/tail is" + chead + "/" + ctail);
    }
}
