package com.coreprogram;


import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter how many times you want to flip the coin..");
        Scanner scan = new Scanner(System.in);
        int flipNo = scan.nextInt();
        scan.close();
        getFlipDetails(flipNo);
    }

    public static void getFlipDetails(int flipNo) {
        int headCount = 0 , tailCount = 0;
        float headPercen , tailPercen;
        for (int i =1; i <= flipNo; i++)
        {
            float coinFlip = (float) Math.random();
            if (coinFlip > 0.5)
            {
                headCount++;
                System.out.println("Flipping Head");
            }
            else
            {
                tailCount++;
                System.out.println("Flipping Tail");
            }
        }
        headPercen = (float) headCount/flipNo*100;
        tailPercen = (float) tailCount/flipNo*100;
        System.out.println("Total Head count : "+headCount+"\nAnd the percentage is : "+headPercen+" %");
        System.out.println("Total Tail count : "+tailCount+"\nAnd the percentage is : "+tailPercen+" %");
    }
}
