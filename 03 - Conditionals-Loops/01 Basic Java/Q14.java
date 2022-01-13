import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        float height = sc.nextFloat();
        System.out.print("Enter the radius of the triangle : ");
        float radius = sc.nextFloat();
        double pie=3.14285714286;
        System.out.println("The area of the triangle is : " + ( pie * (radius * radius) * height/3));
    }
}
