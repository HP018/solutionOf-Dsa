public class Q21 {
    public static void main(String[] args) {
        int i = 20;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        while(i > 2){
            i--;

            int temp = b;
            b = a+b;
            a = temp;
            System.out.print(" "+b);
        }
    }    
}
