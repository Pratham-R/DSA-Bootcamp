import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        if(first > second){
            System.out.println("The first number is greater");
        }else{
            System.out.println("The second number is greater");
        }
    }
}
