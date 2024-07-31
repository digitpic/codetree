import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = str.indexOf("e");
        String result = str.substring(0, index) + str.substring(index+1);
        System.out.println(result);
    }
}