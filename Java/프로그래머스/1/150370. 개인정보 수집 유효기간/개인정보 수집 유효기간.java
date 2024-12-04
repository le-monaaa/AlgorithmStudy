import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termMap = new HashMap<>();
        for(String term : terms) {
            String[] splitTerm = term.split(" ");
            termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        int todayDate = toDate(today);

        List<Integer> expiredIndices = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int startDate = toDate(privacy[0]);
            String termType = privacy[1];

            int expirationDate = addMonths(startDate, termMap.get(termType));

            // 만료 여부 확인
            if (expirationDate <= todayDate) {
                expiredIndices.add(i + 1);
            }
        }
        return expiredIndices.stream().mapToInt(Integer::intValue).toArray();
    }

    private int toDate(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return year * 10000 + month * 100 + day;
    }
    private int addMonths(int date, int months) {
        int year = date / 10000;
        int month = (date % 10000) / 100;
        int day = date % 100;

        month += months;
        while (month > 12) {
            year++;
            month -= 12;
        }

        return year * 10000 + month * 100 + day;
    }
}