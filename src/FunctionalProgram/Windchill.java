package FunctionalProgram;

public class Windchill {
    public static void main(String[] args) {
        int temp = Integer.parseInt(args[0]);
        int velocity = Integer.parseInt(args[1]);
        double p = (double)Math.pow(velocity, 0.16);
        getWindChill(temp, velocity, p);
    }
    public static void getWindChill(int t, int v, double p)
    {
        if(t<=50 && 3<=v && v<=120)
        {
            double w = 35.74+0.6215*t+(0.4275*t-35.75)*p;
            System.out.println();
            System.out.println("Temperature is : "+t+" Fahrenheit.");
            System.out.println("Wind speed is : "+v+" miles/hour.");
            System.out.println("The Effective Temperature to be : "+w);
        }
        else
            System.out.println("Provide valid Temperature and Wind speed.");
    }
}
