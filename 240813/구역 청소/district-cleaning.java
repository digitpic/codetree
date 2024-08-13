import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        if(intersecting(a, b, c, d)) 
            System.out.print(Math.max(b, d) - Math.min(a, c));
        
        else 
            System.out.print((b - a) + (d - c));
        
    }

    public static boolean intersecting(int x1, int x2, int x3, int x4) {

        // 겹치지 않는 경우
        if(x2 < x3 || x4 < x1)
            return false;
            
        // 나머지는 전부 겹치는 경우
        else
            return true;
    }

}