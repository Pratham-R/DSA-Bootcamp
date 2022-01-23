import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("Enter the " + n + " elements respectively : ");
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("The average of the elements is " + average);
        in.close();
    }
}
