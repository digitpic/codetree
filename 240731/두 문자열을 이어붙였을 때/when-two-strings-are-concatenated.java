import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = sc.next();
        arr[1] = sc.next();

        String str = "", reverseStr = "";
        str += arr[0];
        str += arr[1];

        reverseStr += arr[1];
        reverseStr += arr[0];
        
        if (str.equals(reverseStr)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }   
    }
}