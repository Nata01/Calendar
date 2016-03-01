import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.YearMonth;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
//        Calendar calendar = new CalendarConsole(System.out);
//        Calendar calendar = new CalendarText(new PrintStream("calendar.txt"));
        Calendar calendar = new CalendarHtml(new PrintStream("calendar.html"));


        int currentDay = LocalDate.now().getDayOfMonth();
        YearMonth currentMonth = YearMonth.now();
        calendar.printMonth(currentMonth, currentDay);
    }
}
