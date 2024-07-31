import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();
        
        int inputLen = inputStr.length();
        int targetLen = targetStr.length();

        for(int i = 0; i < inputLen; i++) {
            // inputStr의 i 부터 i + targetLen - 1까지의 원소가
            // targetLen의 0부터 targetLen - 1 까지의 원소와
            // 정확히 일치하는지 확인합니다.
            
            // 만약 inputStr의 끝 원소인 i + targetLen - 1 번째가
            // 존재하지 않는다면 비교를 하지 않습니다.
            if(i + targetLen - 1 >= inputLen)
                continue;
            
            // inputStr의 sIdx1에서 eIdx1 까지의 문자열과
            // outputStr의 sIdx2에서 eIdx2 까지의 문자열과 일치하는지를 비교합니다.
            boolean isMatched = true;
            for(int j = 0; j < targetLen; j++) {
                if(inputStr.charAt(i + j) != targetStr.charAt(j))
                    isMatched = false;
            }
            
            if(isMatched) {
                // 모든 문자에 대하여 매칭이 된 경우:
                System.out.print(i);
                System.exit(0);
            }
        }

        // 매칭이 되지 않는 경우:
        System.out.print(-1);
    }
}