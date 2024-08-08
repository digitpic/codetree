import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }

    public static int sum(int n) {
        if (n <= 2)
            return n;
        
        return n + sum(n-2);

    }

}