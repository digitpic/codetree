import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for (int i=0; i<len; i++) {
            char c = str.charAt(i);
            if ( c >= 'A' && c <= 'Z') {
                System.out.print((char)(c - 'A' + 'a'));
            }
            else if (c >= 'a' && c <= 'z') {
                System.out.print((char)(c - 'a' + 'A'));
            }
        }
        sc.close();
    }
}