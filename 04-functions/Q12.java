import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(triplet(a,b,c)){
            System.out.println("Its a Pythagorean triplet");
        }
        else{
            System.out.println("Its not a Pythagorean triplet");
        }
        in.close();
    }

   private static boolean triplet(int a, int b, int c){
       if(a>b && a>c){
           return (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2));
       }
       else if(b>a && b>c){
        return (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2));
       }
       else{
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
       }
   }

}
