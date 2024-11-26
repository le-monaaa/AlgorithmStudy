import java.time.LocalDate;
class Solution {
public String solution(int a, int b) {

    LocalDate date = LocalDate.of(2016, a, b);
    String dayName = date.getDayOfWeek().name();
    String answer = dayName.substring(0,3);
    return answer;
}
}