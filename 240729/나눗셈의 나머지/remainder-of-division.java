import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        // 0~9
        int[] countArr = new int[10];

        while (a > 1) {
            countArr[a%b]++;
            a /= b;
        }

        for (int i = 0; i < 10; i++) {
            if (countArr[i] != 0) {
               result += countArr[i] * countArr[i];
            } 
        }

        System.out.println(result);
    }
}