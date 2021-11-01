import java.util.Scanner;
public class Leap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a year ");
        int yr = s.nextInt();
        if(yr%100==0 && yr%400==0){
            System.out.println("Its a Leap year");
        }
        else if(yr%4==0 && yr%100!=0){
            System.out.println("Its a Leap year");
        }
        else{
            System.out.println("Its not a Leap year");
        }
        s.close();
    }
}