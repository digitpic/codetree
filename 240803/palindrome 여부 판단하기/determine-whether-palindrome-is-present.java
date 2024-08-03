import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = isPalindrome(s);
        System.out.println(result);
    }

    public static String isPalindrome(String s) {
        String result = "";
        boolean mark = false;

        for (int i=0; i<s.length()/2; i++) {
            int endIndex = s.length()-1-i;
            if (s.charAt(i) == s.charAt(endIndex)) {
                mark = true;
            }
            else {
                mark = false;
                break;
            }
        }
        
        return mark ? "Yes" : "No";
    }

}