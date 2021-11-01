import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        if(perfect(num) == num){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
        in.close();
    }

    private static int perfect(int num) {
        int s = 1;
        for(int i = 2; i*i <= num; i++){
            if(num%i == 0){
                if(i*i == num){
                    s = s +i;
                }
                else{
                    s = s + i + num/i;
                }
            }
        }
        return s;
    }
}