import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        float mark = s.nextFloat();
        System.out.println("Grade: "+ grade(mark));
        s.close();
    }

    // 91-100         AA 
    // 81-90          AB 
    // 71-80          BB 
    // 61-70          BC 
    // 51-60          CD 
    // 41-50          DD 
    // <=40          Fail 

    private static String grade(float m){
        if(m > 90 && m <= 100){
            return "AA";
        }
        else if(m > 80 && m <= 90){
            return "AB";
        }
        else if(m > 70 && m <= 80){
            return "BB";
        }
        else if(m > 60 && m <= 70){
            return "BC";
        }
        else if(m > 50 && m <= 60){
            return "CD";
        }
        else if(m > 40 && m <= 50){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
}