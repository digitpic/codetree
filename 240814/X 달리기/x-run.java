import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int speed = 0, meter = 0, time = 0;

        while (meter < x) {

            // 시간 증가
            time++;

            // 속도 증가
            if ((meter + speed + 1) <= x && 
                (x - (meter + speed + 1)) >= (speed + 1) * (speed + 2) / 2) {
                speed++;
            }

            // 속도 유지
            else if ((meter + speed) < x &&
                (x - (meter + speed)) >= (speed * (speed - 1)) / 2) {
                
            }

            // 속도 감소
            else {
                speed--;
            }

            // 이동
            meter += speed;

        }
        
        System.out.println(time);
        
    }
}