import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char[] arr = str.toCharArray();

        char change = arr[0];
        char target = arr[1];
        
        for (int i=0; i<len;i++) {
            if (arr[i] == target) {
                arr[i] = change;
            } 
        }

        str = String.valueOf(arr);
        System.out.println(str);
    }
}