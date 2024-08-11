import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // [1] 변수 선언
        int n = sc.nextInt(); // n 개의 밭
        int h = sc.nextInt(); // h 높이로 나오게끔
        int t = sc.nextInt(); // 최소 t 번 이상

        // n 개의 높이 정보를 담을 배열
        int[] heights = new int[n];

        // [2] 배열 정보 입력 받기  
        for (int i=0; i<n; i++)
            heights[i] = sc.nextInt();
        
        int minCost = Integer.MAX_VALUE;

        // [3] 최소 비용 계산
        for (int i = 0; i <= n - t; i++) {

            int currentCost = 0;

            // [3][1] 각 구간 비용 계산
            for (int j = i; j < i + t; j++) {

                if (heights[j] < h)
                    currentCost += (h - heights[j]);
                
                else if (heights[j] > h) 
                    currentCost += (heights[j] - h);

            }

            // [3][2] 현재 최소 비용보다 작다면 갱신
            if (currentCost < minCost)
                minCost = currentCost;

            // [3][3] t 보다 긴 구간에서도 동일한 높이로 조정이 필요한 경우
            for (int j = i + t; j < n && heights[j] == h; j++) {

                if (heights[j] < h) 
                    currentCost += (h - heights[j]);

                else if (heights[j] > h) 
                    currentCost += (heights[j] - h);

                if (currentCost < minCost)
                    minCost = currentCost;

            }

        }

        // [4] 최소 비용 출력
        System.out.println(minCost);

    }
}