import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Parallelogram : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the Parallelogram : ");
        float width = sc.nextFloat();
        System.out.println("The perimeter of the Parallelogram is : " + ( 2 * (length + width )) );
    }
}
