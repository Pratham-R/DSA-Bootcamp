import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first side : ");
        int a = in.nextInt();
        System.out.print("Enter the second side : ");
        int b = in.nextInt();
        System.out.print("Enter the third side : ");
        int c = in.nextInt();
        pythagoean(a, b, c);
        in.close();
    }

    private static void pythagoean(int a, int b, int c) {
        if ((((a * a) + (b * b)) == (c * c)) || ((((b * b) + (c * c))) == (a * a))
                || (((c * c) + (b * b)) == (a * a))) {
            System.out.println("Yes it is a pythagorean triplet");
        } else
            System.out.println("No it is not a pythagorean triplet");
    }
}