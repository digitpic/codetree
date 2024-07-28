import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 1;
        for (int i = a; i < b+1; i++) {
            if (i%a == 0) {
                prod *= i;
            }
        }
        System.out.println(prod);
    }
}