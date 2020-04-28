package com.ProgramConstructs.Sequence;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scan.next();
        System.out.println("Hello, " + name);
    }
}