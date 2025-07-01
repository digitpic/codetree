import java.util.*;
import java.io.*;

public class Main {
    private static int k;
    private static int n;
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        k = Integer.parseInt(tokens.nextToken());
        n = Integer.parseInt(tokens.nextToken());
        
        find(0);
    }
    
    private static void find(int count) {
        if (count == n) {
            print();
            return;
        }
        
        for (int i = 1; i <= k; i++) {
            if (count >= 2
                    && numbers.get(numbers.size() - 1) == i
                    && numbers.get(numbers.size() - 2) == i) {
                continue;
            }

            numbers.add(i);
            find(count + 1);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void print() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
    }
}