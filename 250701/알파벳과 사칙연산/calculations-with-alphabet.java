import java.util.*;

public class Main {

    private static int n;
    private static char[] operand;
    private static char[] operator;
    private static List<Integer> selected = new ArrayList<>();
    private static Map<Character, Integer> map = new HashMap<>();
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        
        n = expression.length();
        operand = new char[n / 2 + 1];
        operator = new char[n / 2];

        int operandIndex = 0;
        int operatorIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                operand[operandIndex++] = expression.charAt(i);
            }

            if (i % 2 == 1) {
                operator[operatorIndex++] = expression.charAt(i);
            }            
        }

        find(0);

        System.out.println(max);
    }

    private static void find(int count) {
        if (count == n / 2 + 1) {
            max = Math.max(max, calculate());
            return;
        }
        
        if (map.containsKey(operand[count])) {
            selected.add(map.get(operand[count]));
            find(count + 1);
            selected.remove(selected.size() - 1);
        } else {
            for (int i = 1; i <= 4; i++) {
                selected.add(i);
                map.put(operand[count], i);
                find(count + 1);
                selected.remove(selected.size() - 1);
                map.remove(operand[count]);
            }
        }
    }

    private static int calculate() {
        int result = selected.get(0);
        
        for (int i = 1; i < selected.size(); i++) {
            if (operator[i - 1] == '+') {
                result += selected.get(i);
            } else if (operator[i - 1] == '-') {
                result -= selected.get(i) ;
            } else if (operator[i - 1] == '*') {
                result *= selected.get(i);
            }
        }

        return result;
    }
}