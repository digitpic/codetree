import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x1, x2;
        int maxX1 = Integer.MIN_VALUE, minX2 = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 시작점 중 가장 뒤에 있는 좌표와 끝점 중 가장 앞에 있는 점의 좌표를 확인
        for(int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            x2 = sc.nextInt();

            maxX1 = Math.max(maxX1, x1);
            minX2 = Math.min(minX2, x2);
        }

        sc.close();
        
        // 어느 한 선분이라도 시작점이 다른 선분의 끝점보다 뒤에 온다면
        // 선분이 전부 겹칠 수 없음
        if(minX2 >= maxX1)
            System.out.print("Yes");
        else
            System.out.print("No");
            
    }
}