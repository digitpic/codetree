import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }

    public static int sum(int n) {
        if (n < 10)
            return n*n;
        return (n % 10) * (n % 10) + sum(n / 10);
    }
}