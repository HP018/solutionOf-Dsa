import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input 2 number ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a<b){
            a = a+b;
            b = a-b;
            a = a-b;
        }
        int hcf = getHcf(a,b);
        System.out.println("HCF is "+ hcf);
        System.out.println("LCM is "+ ((a*b)/hcf));
        s.close();
    }
    static int getHcf(int x, int y){
        if(x%y==0){
            return y;
        }
        else{
            return getHcf(y, x%y);
        }
    }
}
