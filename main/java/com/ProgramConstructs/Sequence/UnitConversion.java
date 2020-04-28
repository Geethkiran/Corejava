package com.ProgramConstructs.Sequence;

public class UnitConversion {
    public static void main(String[] args) {
        System.out.println(" one feet is equal to 12 inch");
        System.out.println("For 42 inch is equal to : " + (42 / 12));
        System.out.println("Rectangular plot of 60 feet x 40 feet in meter is : ");
        double length = 60 * 0.3;
        double breadth = 40 * 0.3;
        System.out.println("Rectangular Plot in meter is " + length + " meter x " + breadth + " meter");
        System.out.println(length * breadth);
        System.out.println("one squareMeter is equal to 0.000247105 acres");
        System.out.println("Area of 25 such plots in acres is : " + (length * breadth * 0.000247105));
    }
}