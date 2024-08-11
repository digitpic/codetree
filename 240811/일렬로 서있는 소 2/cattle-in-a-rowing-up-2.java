import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cowData = new int[n];

        for (int i=0; i<n; i++)
            cowData[i] = sc.nextInt();
        
        int cnt = 0;
        for (int i=0; i<n; i++)
            for (int j=i+1; j<n; j++)
                for (int k=j+1; k<n; k++)
                    if (cowData[i] <= cowData[j] && cowData[j] <= cowData[k])
                        cnt++;
        
        System.out.println(cnt);

    }
}