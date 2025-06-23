import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int answer;
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        find(0);
        System.out.println(answer);
    }

    private static void find(int count) {
        if (count == n) {
            if (isBeautiful()) {
                answer++;
            }
            return;
        }

        for (int i = 1; i <= 4; i++) {
            numbers.add(i);
            find(count + 1);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static boolean isBeautiful() {
        for (int i = 0; i < n; i += numbers.get(i)) {
            if (n <= i + numbers.get(i) - 1) {
                return false;
            }
            
            for (int j = i; j < i + numbers.get(i); j++) {
                if (numbers.get(i) != numbers.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
