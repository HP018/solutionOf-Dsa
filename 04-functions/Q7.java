import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        if(prime(num)){
        System.out.println("Number is prime");
        }
        else{
        System.out.println("Number is not prime");
        }
        in.close();
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
