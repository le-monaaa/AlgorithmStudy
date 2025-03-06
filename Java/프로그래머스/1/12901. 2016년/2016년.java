import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();
        return day.toString().substring(0,3);
    }
}