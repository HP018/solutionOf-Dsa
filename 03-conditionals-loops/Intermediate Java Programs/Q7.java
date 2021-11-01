import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        int m = a;
        for(int i = 2; i<=b; i++){
            m *= a;
        }
        System.out.println("a power b is "+m);
        in.close();
    }
}
