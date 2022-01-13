import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the Parallelogram : ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of the Parallelogram : ");
        float height = sc.nextFloat();
        System.out.println("The area of the Parallelogram is : " + (base * height) );
    }
}