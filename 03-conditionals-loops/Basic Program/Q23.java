import java.util.Scanner;
import java.lang.Math;
public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = in.nextInt();
        System.out.print("Factors are: 1 ");
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0){
                System.out.print(i+" "+num/i+" ");
            }
        }
        in.close();
    }
}
