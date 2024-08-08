import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int prod = n1 * n2 * n3;
        System.out.println(sumValue(prod));
    }

    public static int sumValue(int prod) {
        if (prod < 10)
            return prod;

        int sum = prod % 10;

        return sum + sumValue(prod / 10);
    }

}