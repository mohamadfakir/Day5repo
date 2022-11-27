package Day5program;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend = scan.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = scan.nextInt();
        scan.close();
        int quotient = getQuotient(dividend,divisor);
        int remainder = getRemainder(dividend,divisor);
        System.out.println("The Quotient is = " +quotient);
        System.out.println("The Remainder is = " +remainder);
    }
    public static int getQuotient(int dividend, int divisor)
    {
        return dividend / divisor;
    }
    public static int getRemainder(int dividend, int divisor)
    {
        return dividend % divisor ;
    }
}
