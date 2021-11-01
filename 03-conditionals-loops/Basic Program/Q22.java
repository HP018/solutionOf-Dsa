import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        System.out.println("Difference "+ subtractProductAndSum(n));
        in.close();
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0) {
            int r = n%10;
            n = n/10;
            
            sum = sum+r;
            product = product*r;
        }
       return product-sum;
    }
}
