import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();

        System.out.println("The circumference of the circle is " + calculateCircumference(radius));
        System.out.println("The area of the circle is " + calculateArea(radius));

        sc.close();
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}