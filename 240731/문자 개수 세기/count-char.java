import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char word = sc.next().charAt(0);
        int cnt = 0;
        int len = str.length();
        for (int i=0; i<len; i++) {
            if (str.charAt(i) == word) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}