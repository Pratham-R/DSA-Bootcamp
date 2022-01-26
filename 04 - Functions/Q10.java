import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string/number : ");
        String st = sc.next();

        if (checkPalindrome(st) == true)
            System.out.print("Yes, it is a palindrome");
        else
            System.out.print("No, it is not a palindrome");
        
        sc.close();
    }

    static boolean checkPalindrome(String str) {

        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }

        return true;
    }
}
