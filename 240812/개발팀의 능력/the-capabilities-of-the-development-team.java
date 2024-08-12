import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int devs = 5;
        int[] stats = new int[devs];

        for (int i = 0; i < devs; i++)
            stats[i] = sc.nextInt();

        // 모든 팀 능력치 계산
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < devs; i++) {
            for (int j = i + 1; j < devs; j++) {
                for (int k = 0; k < devs; k++) {

                    if (k == i || k == j)
                        continue;

                    for (int l = k + 1; l < 5; l++) {

                        if (l == i || l == j) 
                            continue;

                        // 나머지 한 사람 인덱스 찾기
                        // 0 + 1 + 2 + 3 + 4 = 10
                        // 10 - 현재까지 나온 인덱스 = 나머지 인덱스
                        int lastIndex = 10 - i - j - k - l; 
                        int team1 = stats[i] + stats[j];
                        int team2 = stats[k] + stats[l];
                        int team3 = stats[lastIndex];
                        
                        Set<Integer> teamSet = new HashSet<>();
                        teamSet.add(team1);
                        teamSet.add(team2);
                        teamSet.add(team3);

                        if (teamSet.size() == 3) {
                            int maxVal = Math.max(team1, Math.max(team2, team3));
                            int minVal = Math.min(team1, Math.min(team2, team3));
                            minDifference = Math.min(minDifference, maxVal - minVal);
                        }

                    }

                }
            }
        }

        if (minDifference == Integer.MAX_VALUE)
            System.out.println(-1);
        else 
            System.out.println(minDifference);
        
    }
}