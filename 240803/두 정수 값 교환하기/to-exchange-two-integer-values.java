import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    
    public static void swap(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // java의 경우 int값을 그대로 넘겨 swap은 어렵다.
        // IntWrapper라는 객체를 만들어 넘기는 방식으로 해결한다.
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);

        swap(nWrapper, mWrapper);

        n = nWrapper.value;
        m = mWrapper.value;

        System.out.println(n + " " + m);
    }
}