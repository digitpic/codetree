import java.util.Scanner;
public class Main {

    public static int MAX_X = 10000;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int speed = 0, meter = 0, time = 0;

        while (meter < x) {
            time++;

            // x 만큼 이동했을 때
            if (meter == x) {
                // 무한반복문 탈출
                break;
            }

            // 한계에 이르렀을 때
            if (meter >= x/2) {
                // 속도가 1이라면
                if (speed == 1) {
                    // 현재 상태 유지
                    continue;
                }
                    
                // 속도 감소
                speed--;
            }

            meter += speed;
            speed++;

        }
        
        System.out.println(time);
        
    }
}