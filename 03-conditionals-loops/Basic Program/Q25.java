import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            int lar = i;
            while(true){
                i = in.nextInt();
                if(i==0){
                    break;
                }
                if(i > lar){
                    lar = i;
                }
            }
            System.out.println("sum is: "+lar);
            in.close();
    }    
}
