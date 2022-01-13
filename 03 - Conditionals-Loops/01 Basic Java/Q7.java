import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle : ");
        float a = sc.nextFloat();
        System.out.println("The area of the equilateral triangle is : " + (0.25 * 1.732 * a * a));
    }
}
