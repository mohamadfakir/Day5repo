package com.coreprogram;


public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The power table of 2 is : \n");
        getTableOfTwo(n);
    }

    public static void getTableOfTwo(int n) {
        int a = 1, b = (int) Math.pow(2,n);
        if (n >= 0 && n < 31)
        {
            while (a < b) {
                a = a * 2;
                System.out.println(a);
            }
        }
        else
            System.out.println("Provide a valid input for n");
    }
}

