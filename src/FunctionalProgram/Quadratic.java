package FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a: "+"\n");
        a = scan.nextInt();
        System.out.println("Enter the value of b: "+"\n");
        b = scan.nextInt();
        System.out.println("Enter the value of c: "+"\n");
        c = scan.nextInt();
        scan.close();
        int delta = getDelta(a,b,c);
        System.out.println("Equation is: a*x*x + b*x + c"+"\n");
        getQuadraticRoots(a,b,delta);
    }
    public static int getDelta(int a, int b, int c)
    {
        int d = b*b-4*a*c;
        return d;
    }
    public static void getQuadraticRoots(int a, int b , int delta)
    {
        double x1 = (-b+((double)Math.sqrt(delta)))/(2*a);
        double x2 = (-b-((double)Math.sqrt(delta)))/(2*a);
        System.out.println("Roots of x are: ");
        System.out.print("x1: "+x1);
        System.out.print("x2: "+x2);
    }
}
