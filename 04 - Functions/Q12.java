import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();
        primes(a, b);
        in.close();
    }

    private static void primes(int a, int b) {
        for (int i = a; i < b; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        else {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0)
                    return false;
            }
            return true;
        }
    }
}