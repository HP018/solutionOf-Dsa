import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter char");
        char c = in.next().charAt(0);
        if(isVowel(c)){
            System.out.println(c+" is a vowel");
        }
        else{
            System.out.println(c+" is a consonant");
        }
        in.close();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if(c == 'a' || c=='e' || c=='i' || c == 'o' || c=='u'){
            return true;
        }
        return false;
    }
}
