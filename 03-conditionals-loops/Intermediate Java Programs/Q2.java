import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter power: ");
        float p = s.nextFloat();
        System.out.println("Enter days: ");
        int d = s.nextInt();
        
        float charge = 24*p*d;
        System.out.println("Electricity charge is "+charge+" Watts/Hour");
        s.close();
    }
}
