import java.util.*;

public class Main {
    private static final int MAX_N = 8;

    private static int n;
    private static List<Integer> selected = new ArrayList<>();
    private static int[] visited = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        find(n);
    }

    private static void find(int number) {
        if (number == 0) {
            print();
            return;
        }

        for (int i = n; i >= 1; i--) {
            if (visited[i] == 1) {
                continue;
            }

            visited[i] = 1;
            selected.add(i);

            find(number - 1);

            visited[i] = 0;
            selected.remove(selected.size() - 1);
        }
    }

    private static void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(selected.get(i) + " ");
        }
        System.out.println();
    }
}