import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("Reverse of a string "+str+" is: ");
        int i = str.length();
        while(i>0){
            System.out.print(str.charAt(i-1));
            i--;
        }
        in.close();
    }
}