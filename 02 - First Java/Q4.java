import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        System.out.println("Sum of two number : " + (first + second));
        System.out.println("Substractions of two number : " + (first - second));
        System.out.println("Multiplication of two number : " + (first * second));
        System.out.println("Division of two number : " + (first / second));
    }
}