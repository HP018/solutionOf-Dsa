import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int n = num;
        int revNum  = 0;
        while(num > 0){
            int r = num%10;
            num /= 10;
            revNum = revNum*10 + r;
        }
        // System.out.println(revNum);
        if(revNum == n){
            System.out.println("It is Pallindrome number");
        }
        else{
            System.out.println("Its not pallindrome number");
        }
        sc.close();
    }
}
