import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Input numbers. X will terminate ");

        // the hasnext function shall terminate if it counters x as input whether in a singular line or line feed
        while(!s.hasNext("x")){ 
            sum = sum +s.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
}