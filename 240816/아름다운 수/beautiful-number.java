import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int n;
    static int ans;
    static ArrayList<Integer> numList = new ArrayList<>();
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        countBeautifulSeq(0);
        
        System.out.print(ans);
    }

    public static void countBeautifulSeq(int cnt) {

        if(cnt == n) {

            if(isBeautiful())
                ans++;

            return;

        }
        
        for(int i = 1; i <= 4; i++) {
            numList.add(i);
            countBeautifulSeq(cnt + 1);
            numList.remove(numList.size() - 1);
        }

    }

    public static boolean isBeautiful() {

        for(int i = 0; i < n; i += numList.get(i)) {

            if(i + numList.get(i) - 1 >= n)
                return false;

            for(int j = i; j < i + numList.get(i); j++)
                if(numList.get(j) != numList.get(i))
                    return false;
        }

        return true;
    }

}