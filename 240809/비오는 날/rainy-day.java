import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] dataArr = new Weather[n];
        for (int i=0; i<n; i++)
            dataArr[i] = new Weather(LocalDate.parse(sc.next()), sc.next(), sc.next());
        
        Weather[] rainy = new Weather[n];
        
        int index = 0;

        for (int i=0; i<n; i++) {
            if (dataArr[i].status.equals("Rain")) {
                rainy[index++] = dataArr[i];
            }
        }

        Weather result = rainy[0];
        for (int i=1; i<index; i++) {
            long daysBetweenTarget = ChronoUnit.DAYS.between(rainy[i].date, LocalDate.now()); 
            long daysBetweenResult = ChronoUnit.DAYS.between(result.date, LocalDate.now());

            if (daysBetweenResult < daysBetweenTarget) {
                result = rainy[i];
            }
        }

        System.out.println(result.date + " " + result.day + " " + result.status);

    }
}

class Weather {
    LocalDate date;
    String day;
    String status;

    public Weather() {

    }

    public Weather(LocalDate date, String day, String status) {
        this.date = date;
        this.day = day;
        this.status = status;
    }
        
}