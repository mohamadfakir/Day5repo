package com.coreprogram;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st no.");
        int a = scan.nextInt();
        System.out.println("Enter the 2nd no.");
        int b = scan.nextInt();
        scan.close();
        System.out.println("Numbers before swapping is a = " + a + " & b = " + b);
        System.out.println("By Method - 1");
        swapNo(a, b);//From method -1
        System.out.println();
        System.out.println("By Method - 2");
        swapNo2(a, b);// From method -2
    }

    //Method - 1(Swapping 2 nos by taking temp variable
    public static void swapNo(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " & b = " + b);
    }

    //Method - 1(Swapping 2 nos without taking temp variable
    public static void swapNo2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = " + a + " & b = " + b);
    }
}
