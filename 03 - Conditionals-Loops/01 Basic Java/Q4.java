import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the Isosceles triangle : ");
        float height = sc.nextFloat();
        System.out.print("Enter the base of the Isosceles triangle : ");
        float base = sc.nextFloat();
        System.out.println("The area of the Isosceles triangle is : " + ((base * height) / 2));
    }
}