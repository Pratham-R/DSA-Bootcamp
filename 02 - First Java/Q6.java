import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the currency in ruppee : ");
        float ruppee = sc.nextFloat();
        System.out.println("The converted currency in USD is : " + (ruppee * 0.014));
    }
}
