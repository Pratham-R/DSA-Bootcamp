import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        number(age);
        in.close();
    }

    static int number(int age) {
        if (age >= 18)
            System.out.println("You are eligible for vote.");
        else
            System.out.println("You are not eligible for vote.");
        return age;
    }
}