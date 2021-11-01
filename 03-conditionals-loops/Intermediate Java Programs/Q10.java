import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks obtained");
        int obtainedMarks = in.nextInt();
        System.out.println("Enter total marks ");
        int total = in.nextInt();

        System.out.println("Cgpa obtained is "+ (float)obtainedMarks/total*100/9.5f);
        in.close();
    }
}
