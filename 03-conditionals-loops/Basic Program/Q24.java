import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int sum = 0;
            while(true){
                int i = in.nextInt();
                if(i==0){
                    break;
                }
                sum += i;
            }
            System.out.println("sum is: "+sum);
            in.close();
    }    
}
