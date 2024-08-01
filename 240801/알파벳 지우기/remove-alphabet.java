import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int len1 = s1.length();
        for (int i=0; i<len1; i++) {
            char c = s1.charAt(i);
            if ( ( c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
                s1 = s1.substring(0, i) + s1.substring(i+1, len1);
                len1--;
                i--;
            }                                
        }
        int n1 = Integer.parseInt(s1);

        int len2 = s2.length();
        for (int i=0; i<len2; i++) {
            char c = s2.charAt(i);
            if ( ( c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
                s2 = s2.substring(0, i) + s2.substring(i+1, len2);
                len2--;
                i--;
            }                                
        }
        int n2 = Integer.parseInt(s2);
        System.out.println(n1+n2);
        
    }
}