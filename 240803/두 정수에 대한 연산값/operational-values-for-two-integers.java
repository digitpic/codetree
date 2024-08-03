import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[2];
        arr = fun(a, b);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static int[] fun(int a, int b) {
        int[] arr = new int[2];
        if (a>b) {
            a += 25;
            b *= 2;
        }
        else if (a<b) {
            a *= 2;
            b += 25;
        }
        arr[0] = a;
        arr[1] = b;
        return arr;
    }
}