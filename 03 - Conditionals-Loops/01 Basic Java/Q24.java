import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number: ");
        do{
            num = in.nextInt();
            sum = sum + num;
        }
        while (num != 0);
        System.out.println("Sum = " + sum);
    }
}
