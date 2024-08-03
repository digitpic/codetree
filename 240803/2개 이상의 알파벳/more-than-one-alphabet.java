import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        checkDuplication(s);
    }

    public static void checkDuplication(String s) {
        int len = s.length();
        Set<Character> arr = new LinkedHashSet<Character>();

        arr.add(s.charAt(0));

        for (int i=1; i<len; i++) {
            if (!arr.contains(s.charAt(i))) {
                arr.add(s.charAt(i));
            }
            else {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
        
    }
}