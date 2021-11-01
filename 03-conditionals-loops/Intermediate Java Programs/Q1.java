import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }

    private static void fact(int n) {
        int m = 1;
        for(int i = 2; i<=n; i++){
            m *= i;
        }
        System.out.println("Factorial is "+ m);
    }
}
