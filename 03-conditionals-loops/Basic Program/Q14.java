import java.util.Scanner;
import java.lang.Math;
public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius and Height");
        float r = s.nextFloat();
        float h = s.nextFloat();
        System.out.println("Vollume of cone: "+ Math.PI*Math.pow(r, 2)*h/3);
        s.close();
    }
}