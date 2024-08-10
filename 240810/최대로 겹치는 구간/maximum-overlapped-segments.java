import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // index range 0 ~ 200
        // using 1 ~ 200
        int[] checked = new int[200+1];

        for (int i=0; i<n; i++) {

            // add offset
            int a = sc.nextInt()+100;
            int b = sc.nextInt()+100;

            // 끝점 닿지 않게
            for (int j=a; j<b; j++) {
                checked[j]++;
            }
        }

        // first element
        int max = checked[0];

        for (int i=1; i<=200; i++) {
            if (checked[i] > max) {
                max = checked[i];
            }
        }

        System.out.println(max);

    }
}