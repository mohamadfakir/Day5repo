package Day5program;

    import java.util.Scanner;

    public class EvenOrOdd {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number.");
            int n = scan.nextInt();
            scan.close();
            checkEvenOrOdd(n);
        }

        public static void checkEvenOrOdd(int n) {
            if (n % 2 == 0)
                System.out.println("Number "+n+" is even.");
            else
                System.out.println("Number "+n+" is odd.");
        }
}
