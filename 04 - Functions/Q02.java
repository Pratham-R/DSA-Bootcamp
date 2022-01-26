import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        number(num);
        in.close();
    }

    static int number(int num) {
        if (num % 2 == 0)
            System.out.println("Entered Number is Even");
        else
            System.out.println("Entered Number is Odd");
        return num;
    }
}
