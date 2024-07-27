import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
              
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }
        sc.close();
    }

}