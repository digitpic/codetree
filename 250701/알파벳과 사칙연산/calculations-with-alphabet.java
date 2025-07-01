import java.util.*;

public class Main {
    private static int n = 6;
    private static String expression;
    private static int[] numbers = new int[n];
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expression = sc.next();

        find(0);
        System.out.println(max);
    }

    private static void find(int count) {
        if (count == n) {
            max = Math.max(max, calculate());
            return;
        }
        
        for (int i = 1; i <= 4; i++) {
            numbers[count] = i;
            find(count + 1);
        }
    }

    private static int calculate() {
        int result = numbers[expression.charAt(0) - 'a'];
        
        for (int i = 2; i < expression.length(); i += 2) {
            if (expression.charAt(i - 1) == '+') {
                result += numbers[expression.charAt(i) - 'a'];
            } else if (expression.charAt(i - 1) == '-') {
                result -= numbers[expression.charAt(i) - 'a'];
            } else if (expression.charAt(i - 1) == '*') {
                result *= numbers[expression.charAt(i) - 'a'];
            }
        }

        return result;
    }
}