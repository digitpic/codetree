import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        b = sc.nextInt();
        a = sc.nextInt();
        int i = b;
        // [1] b부터 a까지 반복
        while (i >= a) {

            // [2] a, b는 짝수이기에 -2 하면 짝수
            System.out.print(i + " ");
            i -= 2;
        }
        


    }
}