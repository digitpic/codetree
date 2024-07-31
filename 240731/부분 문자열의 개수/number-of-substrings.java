import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        int len = str.length();
        int cnt = 0;
        for (int i=0; i<len-1; i++) {
            if (str.charAt(i) == target.charAt(0) && str.charAt(i+1) == target.charAt(1)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}