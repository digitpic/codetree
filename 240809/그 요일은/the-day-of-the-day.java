import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        int startDate = numOfDays(m1, d1);
        int endDate = numOfDays(m2, d2);
        int curDay = numOfDay("Mon");

        for(int date = startDate; date <= endDate; date++) {
            // 오늘의 요일이 day 요일과 같다면 정답에 추가
            if(curDay == numOfDay(day))
                ans++;
            curDay = (curDay + 1) % 7;
        }
        
        System.out.print(ans);
    }

        public static int numOfDays(int m, int d) {
        // 월별 일수
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }
    
    public static int numOfDay(String s) {
        if(s.equals("Mon")) return 0;
        else if(s.equals("Tue")) return 1;
        else if(s.equals("Wed")) return 2;
        else if(s.equals("Thu")) return 3;
        else if(s.equals("Fri")) return 4;
        else if(s.equals("Sat")) return 5;
        return 6;
    }
}