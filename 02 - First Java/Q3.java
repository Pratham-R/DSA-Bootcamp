import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal(p) : ");
        int p = sc.nextInt();
        System.out.print("Enter the Time(t) : ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate(r) : ");
        float r = sc.nextFloat();

        float A = (p*r*t)/100;
        System.out.println("Simple Interest is : ₹ " + A);
    }
}
