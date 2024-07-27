import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0 && list.get(i) % 3 == 0) {
                System.out.println(list.get(i));
            }
        }

    }
}