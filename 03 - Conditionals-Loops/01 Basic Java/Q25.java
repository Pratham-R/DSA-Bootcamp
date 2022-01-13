import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int n,max=0,temp;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
            temp = n;
            if(temp>max)
            {
                max = temp;
            }
        }
        while(n!=0);
        System.out.println(max);
    }
}