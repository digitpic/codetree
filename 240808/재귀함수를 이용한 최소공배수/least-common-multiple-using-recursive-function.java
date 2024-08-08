import java.util.Scanner;
public class Main {

    public static int n;
    public static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(findLCM(0));

    }
    
    public static int findLCM(int index) {
        if (index == n - 1) {
            return arr[index];
        }
        return lcm(arr[index], findLCM(index + 1));
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 유클리드 알고리즘
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}