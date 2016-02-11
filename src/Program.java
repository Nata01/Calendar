import java.time.LocalDate;
import java.time.YearMonth;

public class Program {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        int currentDay = LocalDate.now().getDayOfMonth();
        YearMonth currentMonth = YearMonth.now();
        calendar.printMonth(currentMonth, currentDay);
    }
}
