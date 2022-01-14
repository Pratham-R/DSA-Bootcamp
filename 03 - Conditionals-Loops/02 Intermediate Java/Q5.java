import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        double distance = 0;
        System.out.print("Enter the coordinates of the first point (x1,y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the coordinates of the second point (x2,y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between the two points is " + distance);
        sc.close();
    }
}