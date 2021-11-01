import java.util.Scanner;
public class Currency{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Currency in Indian Ruppe ");
        float ruppe = s.nextFloat();
        System.out.println("Currency in US Dollar is "+ ruppe*0.014);
        s.close();
    }
}