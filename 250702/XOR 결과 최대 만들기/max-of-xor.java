import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 20;

    private static int n;
    private static int m;
    private static int[] numbers = new int[MAX];
    private static List<Integer> selected = new ArrayList<>();
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        find(0, 0);

        System.out.println(answer);
    }

    private static void find(int index, int count) {
        if (index == n) {
            if (count == m) {
                answer = Math.max(answer, calculate());
            }
            
            return;
        }

        selected.add(numbers[index]);
        find(index + 1, count + 1);
        selected.remove(selected.size() - 1);

        find(index + 1, count);
    }

    private static int calculate() {
        int result = 0;

        for (int i = 0; i < m; i++) {
            result ^= selected.get(i);
        }

        return result;
    }
}