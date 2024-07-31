import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char word = sc.next().charAt(0);
        
        int len = str.length();
        int index = -1;

        for (int i=0; i<len; i++) {
            if (str.charAt(i) == word) {
                index = i;
                break;            
            }
            
        }

        System.out.println(index != -1 ? index : "No");

    }
}