import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        float height = sc.nextFloat();
        System.out.print("Enter the base of the triangle : ");
        float base = sc.nextFloat();
        System.out.println("The area of the triangle is : " + ((height * base) / 2));
    }
}
