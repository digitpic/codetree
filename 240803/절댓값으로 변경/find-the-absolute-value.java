import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        changeAbsolute(arr);
    }

    public static void changeAbsolute(int[] arr) {
        int len = arr.length;

        for (int i=0; i<len; i++) {
            if (arr[i] < 0) 
                arr[i] = arr[i] * -1;
        }

        for (int i=0; i<len; i++)
            System.out.print(arr[i] + " ");

    }
}