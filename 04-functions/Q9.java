import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Factorial is "+factorial(num));
        sc.close();
    }

    private static int factorial(int num) {
        if(num == 1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
}
