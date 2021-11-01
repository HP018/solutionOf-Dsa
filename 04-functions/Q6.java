import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius = in.nextFloat();
        System.out.println("Area of circle is "+ area(radius));
        in.close();
    }

    private static float area(float r){
        return (float)(2*Math.PI*r*r);
    }
}