import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        int s=0,c=num;
        while(num > 0){
            int k = num%10;
            num /= 10;
            s = s + (k*k*k);
        }
        if(c==s){
            System.out.println(c+" is amstrong num");
        }
        else{
            System.out.println(c+" is not a amstrong num");
        }
        in.close();
    }
}
