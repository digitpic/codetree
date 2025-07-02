import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX = 10;

    private static int n;
    private static int m;
    
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokens.nextToken());
        m = Integer.parseInt(tokens.nextToken());

        find(0, 0);    
    }

    private static void find(int count, int previous) {
        if (count == m) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (previous < i) {
                numbers.add(i);
                find(count + 1, i);
                numbers.remove(numbers.size() - 1);
            }
        }
    }
}