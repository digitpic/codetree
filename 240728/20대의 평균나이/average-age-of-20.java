import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;
        double avg = 1;
        int input = sc.nextInt();

        while (true) {

            // 20 <= input <= 29
            if ( input < 20 && 29 < input )
                break;

            if (!sc.hasNext())
                break;

            sum += input;
            cnt ++;
            
            input = sc.nextInt();
        }

        avg = (double) sum / cnt;

        System.out.printf("%.2f", avg);
    }

}