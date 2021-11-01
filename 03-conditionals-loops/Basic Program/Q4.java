import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter base and heigth of issocelleus traingle ");
        float b = s.nextFloat();
        float h = s.nextFloat();
        System.out.println("Area is "+(b*h)/2);
        s.close();
    }
}