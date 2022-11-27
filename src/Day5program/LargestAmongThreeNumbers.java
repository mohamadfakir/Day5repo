package Day5program;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter three numbers.");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println("Entered 3 nos are : "+a+"  "+b+"  "+c);
            System.out.println();
            largestNo(a,b,c);//From method - 1
            System.out.println();
            largestNo(a,b,c);//from method - 2
        }

        //Method - 1
        public static void largestNo(int a, int b, int c)
        {
            if (a > b && a > c)
                System.out.println("The largest number is: "+a);
            else if (b > a && b > c)
                System.out.println("The largest number is: "+b);
            else if (c > a && c > b)
                System.out.println("The largest number is: "+c);
            else
                System.out.println("The numbers are same.");
        }

        //Method - 2
        public static void largestNo1(int a, int b, int c)
        {
            int largest = (a > b && a > c ? a : b > c ? b : c);
            System.out.println("The largest number is: "+largest);
        }
}
