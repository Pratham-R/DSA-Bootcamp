import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of interest");
        double rate = sc.nextDouble();
        System.out.print("Enter time");
        double time = sc.nextDouble();

        System.out.println(compoundInterest(p, rate, time));
        sc.close();
    }

    static double compoundInterest(double p, double rate, double time) {
        return p * Math.pow((1 + rate / 100), time) - p;
    }
}