import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;
        double avg = 1;

        while (true) {
            int input = sc.nextInt();

           // 입력받은 값이 20대가 아니면 종료
            if(input >= 30 || input <= 19) {
                System.out.printf("%.2f", (double)sum / cnt);
                break;
            }

            sum += input;
            cnt ++;
            
        }

    }
}