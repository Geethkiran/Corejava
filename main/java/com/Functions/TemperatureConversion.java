package com.Functions;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature");
        double temperature = scanner.nextDouble();
        System.out.println("If Temperature is in Celsius Then Enter true or false ");
        boolean isCelcius = scanner.nextBoolean();
        scanner.close();
        double temp = temperatureConversion(temperature, isCelcius);
        System.out.println(temp);
    }

    public static double temperatureConversion(double temp, boolean isCelcius) {
        double conTemp;
        if (isCelcius) {
            conTemp = (temp * 9) / 5 + 32;
        } else {
            conTemp = ((temp - 32) * 5) / 9;
        }
        return conTemp;
    }
}