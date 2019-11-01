package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you gender and age:");
        String str1 = scanner.next();
        int num1 = scanner.nextInt();
        boolean boy = str1.contains("boy");
        boolean girl = str1.contains("girl");

        if (boy&& num1>=18)
            System.out.println("Can MARRY");
        else if (boy&& num1<18)
            System.out.println("Can NOT MARRY ");
        else if (girl&& num1<16)
            System.out.println("Can NOT MARRY ");
        else if (girl&& num1>=16)
            System.out.println("Can MARRY");
    }
}
