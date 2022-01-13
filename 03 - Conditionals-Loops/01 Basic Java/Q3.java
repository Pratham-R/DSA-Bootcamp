import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle : ");
        float width = sc.nextFloat();
        System.out.println("The area of the rectangle is : " + (width * length) );
    }
}