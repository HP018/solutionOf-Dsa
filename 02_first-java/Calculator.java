import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // Single input Calculator
        // System.out.println("Input two number ");
        // int fir = s.nextInt();
        // int sec = s.nextInt();
        // System.out.println("Input operator from +, -, *, / ");
        // char ch = s.next().charAt(0);
        // if(ch == '+'){
        //     System.out.println(fir+sec);
        // }
        // else if(ch == '-'){
        //     System.out.println(fir-sec);
        // }
        // else if(ch == '*'){
        //     System.out.println(fir*sec);
        // }
        // else if(ch == '/'){
        //     System.out.println(fir/sec);
        // }
        // else{
        //     System.out.println("Wrong input");
        // }

        // Multiple input Calculator
        System.out.println("Real Calculator ");
        float i = 0.0f;
        int check = 0;
        int check1 = 0;
        char ch = ' ';
        float res = 0.0f;
        float total = 0.0f;
        while(s.hasNext()){

            if(s.hasNext("=")){
                break;
            }

            if(ch != ' '){
                total = i;
                check = 1;
            }

            if(s.hasNextFloat()){
                i = s.nextFloat();
                check1 = 1;
            }
            else{
                ch = s.next().charAt(0);
            }

            if(check == 1 && check1==1){
                res = realCal(total, i, ch);
                i = res;
                total = res;
                check = 0;
                check1 = 0;
            }
        }
        System.out.println("Total = "+total);
        s.close();
    }

    static float realCal(float t, float n, char c){
       if(c == '+'){
            return t+n;
        }
        else if(c == '-'){
            return t-n;
        }
        else if(c == '*'){
            return t*n;
        }
        else if(c == '/'){
            return t/n;
        }
        else{
            return t;
        }
    }
}