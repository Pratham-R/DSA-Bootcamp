import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();

        sum(num1, num2);
        System.out.println("The sum is : " + sum(num1, num2));

        in.close();
    }

    static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
