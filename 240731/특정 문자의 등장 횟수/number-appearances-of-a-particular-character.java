import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int eeCnt = 0, ebCnt = 0;
        
        for (int i=0; i<len-1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                eeCnt++;
            }
            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'b') {
                ebCnt++;
            }
        }
    
        System.out.println(eeCnt + " " + ebCnt);

    }
}