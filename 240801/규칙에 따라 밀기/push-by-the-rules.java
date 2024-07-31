import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String q = sc.next();
        int lenQ = q.length();
        
        for (int i=0; i<lenQ; i++) {
            if (q.charAt(i) == 'L') {
                str = str.substring(1, len) + str.substring(0, 1);
            }
            else {
                str = str.substring(len - 1, len) + str.substring(0, len - 1);
            }
        }

        System.out.println(str);
        
    }
}