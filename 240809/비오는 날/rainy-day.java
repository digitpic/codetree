import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Weather result = new Weather("9999-99-99", "", "");

        for (int i=0; i<n; i++) {
            String date = sc.next();
            String day = sc.next();
            String status = sc.next();

            Weather w = new Weather(date, day, status);

            if (status.equals("Rain")) {
                // result 보다 앞선 w 가 나타난 경우
                if (result.date.compareTo(w.date) > 0) {
                    result = w;
                }
            }
        }

        System.out.println(result.date + " " + result.day + " " + result.status);

    }
}

class Weather {
    String date;
    String day;
    String status;

    public Weather() {

    }

    public Weather(String date, String day, String status) {
        this.date = date;
        this.day = day;
        this.status = status;
    }
        
}