package com.FunctionalProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        double x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate value : "+"\n");
        x = scan.nextDouble();
        System.out.println("Enter the y co-ordinate value : "+"\n");
        y = scan.nextDouble();
        scan.close();
        double euclideanDistance = euclideanDistance(x,y);
        System.out.printf("The Euclidean Distance from(x=%g ,y=%g) to origin(0,0) is: %g %n",x,y,euclideanDistance);

    }

    public static double euclideanDistance(double x, double y) {

        double distance = (double)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distance;
    }
}
