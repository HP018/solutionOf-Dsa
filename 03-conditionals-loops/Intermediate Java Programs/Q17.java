import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String s = in.next();
        int len = s.length();
        String rev = "";
        // System.out.print(s.charAt(len-1));
        for(int i = len-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse string is "+ rev);
        in.close();
    }
}
