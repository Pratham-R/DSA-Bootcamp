import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonal(p) of the rhombus : ");
        float p = sc.nextFloat();
        System.out.print("Enter the diagonal(q) of the rhombus : ");
        float q = sc.nextFloat();
        System.out.println("The area of the rhombus is : " + ((p * q) / 2));
    }
}
