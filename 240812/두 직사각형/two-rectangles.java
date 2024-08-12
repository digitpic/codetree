import java.util.Scanner;

public class Main {

    public static int x1, y1, x2, y2;
    public static int a1, b1, a2, b2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        
        if(overlapping(x1, y1, x2, y2, a1, b1, a2, b2))
            System.out.print("overlapping");
        else
            System.out.print("nonoverlapping");
    }

    public static boolean overlapping(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
        // 겹치지 않는 경우
        if(x2 < a1 || a2 < x1 || b2 < y1 || y2 < b1)
            return false;
        // 나머지는 전부 겹치는 경우
        else
            return true;
    }

}