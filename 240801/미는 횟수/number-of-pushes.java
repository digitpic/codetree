import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        int cnt = 0;
        int len = A.length();


        for (int i=0; i<len; i++) {
            A = A.substring(len-1, len) + A.substring(0, len-1);
            cnt++;

            if (A.equals(B)) {
                System.out.println(cnt);
                break;
            }
            if (i == len-1) {
                System.out.println(-1);
                break;
            }
                
        }

    }
}