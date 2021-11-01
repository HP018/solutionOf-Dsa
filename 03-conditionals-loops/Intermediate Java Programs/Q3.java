import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double sum = 0;
        int c = 0;
        while(in.hasNext()){
            if(!in.hasNextInt()){break;}
            int i = in.nextInt();
            sum = i + sum;
            c++;
        }
        System.out.println("Average is "+ sum/c);
        in.close();
    }
}
