import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Prime numbers are:");
        for(int i = a; i<=b ; i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

    private static boolean prime(int num) {
        for(int i = 2; i*i <= num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}