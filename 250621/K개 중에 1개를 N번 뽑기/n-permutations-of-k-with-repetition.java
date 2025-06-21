import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static int k, n;
    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        
		find(0);
	}

    private static void find(int count) {
        if (count == n) {
            print();
            return;
        }

        for (int i = 1; i <= k; i++) {
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
