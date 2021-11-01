import java.util.Scanner;
import java.lang.Math;
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Sides of the traingle separated by space ");
        float s1 = s.nextFloat();
        float s2 = s.nextFloat();
        float s3 = s.nextFloat();
        float semiPerimeter = (s1+s2+s3)/2;
        float area = (float)Math.sqrt(semiPerimeter*(semiPerimeter-s1)*(semiPerimeter-s2)*(semiPerimeter-s3));
        System.out.println("Area of traingle is "+area);
        s.close();
    }
}
