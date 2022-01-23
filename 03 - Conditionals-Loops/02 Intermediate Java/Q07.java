import java.util.*;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the power : ");
        double b = sc.nextDouble();
        System.out.println(Math.pow(a, b));
        sc.close();
    }
}
