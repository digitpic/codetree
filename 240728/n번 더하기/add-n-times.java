import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        a = sc.nextInt();
        n = sc.nextInt();
        int i = 0;
        // [1] n번 반복
        while (i < n) {
            a += n;
            System.out.println(a);
            i++;
        }
        
    }
}