package Day5program;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        getHarmonicValue(n);
    }

    public static void getHarmonicValue(int n) {
        double harmonicNo = 0;
        for (int i = 1; i <= n; i++)
        {
            double a = (double) 1/i;
            harmonicNo += a;
        }
        System.out.println("The "+n+"th Harmonic value is : "+harmonicNo);
    }
}
