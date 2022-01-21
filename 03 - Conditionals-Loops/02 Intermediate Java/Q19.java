import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of principle: ");
        double principle = in.nextDouble();
        System.out.print("Enter the value of rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter the value of time: ");
        double time = in.nextDouble();

        double FI = principle * (Math.pow((1 + rate / 100), time));
        System.out.println("Future Interest is " + FI);
        in.close();
    }
}