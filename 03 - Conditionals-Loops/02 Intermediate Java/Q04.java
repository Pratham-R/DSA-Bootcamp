import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Price of the product : ");
        double p = in.nextFloat();
        System.out.print("Enter the Discount(%) on the product : ");
        double d = in.nextFloat();
        double s;
        s = 100 - d;
        double f_price = (p * s) / 100;
        System.out.print("The Price after Discount is " + f_price);
        in.close();
    }
}
