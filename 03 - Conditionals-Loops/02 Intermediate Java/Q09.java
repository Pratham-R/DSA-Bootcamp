import java.util.*;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Runs: ");
        int runs = input.nextInt();
        System.out.println("Enter number of matches");
        int matches = input.nextInt();
        System.out.println("Enter number of not-out matches");
        int notout = input.nextInt();
        int outmatches = matches - notout;
        double baverage = runs / outmatches;
        System.out.println("Batting Average= " + baverage);
        input.close();
    }
}
