import java.util.Scanner;

public class Main {    

    public static boolean isMoreTwoalp(String str) {
    
        int len = str.length();

        for(int i = 0; i < len; i++)
            if(str.charAt(0) != str.charAt(i))
                return true;
    
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();

        if(isMoreTwoalp(A))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}