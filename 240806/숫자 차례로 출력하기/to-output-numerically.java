import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOrder(n);
        System.out.println();
        printReverse(n);
    }
    public static void printOrder(int n) {
        if (n == 0)
            return;
        printOrder(n-1);
        System.out.print(n + " ");
    }

    public static void printReverse(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printReverse(n-1);
    }
}