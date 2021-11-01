import java.util.Scanner;
import java.lang.Math;
public class Q1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        float r = s.nextFloat();
        System.out.println("Area of circle is " + (Math.PI * r * r));
        s.close();
    }
}