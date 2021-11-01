import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle ");
        float l = s.nextFloat();
        float b = s.nextFloat();
        System.out.println("Area of Rectangle is "+ (l*b));
        s.close();
    }
}
