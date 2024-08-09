import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String n = scanner.next();

        int decimalValue = Integer.parseInt(n, a);

        String result = Integer.toString(decimalValue, b);

        System.out.println(result);
    }
}