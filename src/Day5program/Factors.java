package com.coreprogram;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you want prime factors.");
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        scan.close();
        System.out.println("From method -1");
        getPrimeFactors(no);//From method -1
        System.out.println();
        System.out.println("From method -2");
        getPrimeFactors2(no);//From method -2
    }

    //Method - 1
    public static void getPrimeFactors(int n)
    {
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }

    //Method - 2
    //This is the procedure to find prime nos and check if it is a factor of that no.

    public static void getPrimeFactors2(int n)
    {
        for(int i=1; i<=n; i++)
        {
            if (isPrime(i))
            {
                if (n % i == 0)
                    System.out.println(i);
            }

        }
    }

    public static boolean isPrime(int a)
    {
        if (a == 1 || a == 0)
            return false;
        for (int j = 2; j * j <= a; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }

}
