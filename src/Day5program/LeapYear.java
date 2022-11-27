package Day5program;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = scan.nextInt();
        scan.close();
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if (year >= 1000 && year <= 9999)//for checking year should be in 4 digits.
        {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Specified year: "+year+" is a leap year");
            else
                System.out.println("Specified year: "+year+" is not a leap year");
        }
        else
            System.out.println("Provide a valid Georgian Calender Year.");
    }
}
