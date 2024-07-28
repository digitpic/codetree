import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        boolean satisfied = false;
        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0)
                satisfied = true;
        }
        System.out.println(satisfied ? 1 : 0);
    }
}