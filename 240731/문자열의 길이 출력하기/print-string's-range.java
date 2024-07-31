import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        len = sc.next().length();
        len += sc.next().length();
        System.out.println(len);
    }
}