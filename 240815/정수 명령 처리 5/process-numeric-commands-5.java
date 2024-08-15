import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++) {
            String order = sc.next();
            
            if (order.equals("push_back")) {
                int k = sc.nextInt();
                push_back(k);
            }
                
            else if (order.equals("pop_back"))
                pop_back();

            else if (order.equals("size"))
                System.out.println(size());

            else {
                int k = sc.nextInt() - 1;
                System.out.println(get(k));
            }
                
        }

    }

    public static void push_back(int k) {
        list.add(k);
    }

    public static void pop_back() {
        list.remove(list.size()-1);
    }

    public static int size() {
        return list.size();
    }

    public static int get(int k) {
        return list.get(k);
    }

    


}