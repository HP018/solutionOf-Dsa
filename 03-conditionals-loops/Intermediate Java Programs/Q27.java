import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sn = 0, spe = 0, spo = 0;
        while(in.hasNext()){
            int i = in.nextInt();
            if(i==0){
                break;
            }
            if(i<0){
                sn = sn + i;
            }
            else if(i%2==0){
                spe = spe + i;
            }
            else{
                spo = spo + i;
            }
        }
        System.out.println("Sum of negetive number is " + sn);
        System.out.println("Sum of positive even number is " + spe);
        System.out.println("Sum of positive odd number is " + spo);
        in.close();
    }
}
