
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> scoreMap = new HashMap<>();
        scoreMap.put('R', 0);
        scoreMap.put('T', 0);
        scoreMap.put('C', 0);
        scoreMap.put('F', 0);
        scoreMap.put('J', 0);
        scoreMap.put('M', 0);
        scoreMap.put('A', 0);
        scoreMap.put('N', 0);

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];
            int score = Math.abs(choice - 4);
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            if (choice < 4) {
                scoreMap.put(first, scoreMap.get(first) + score);
            } else if (choice > 4) {
                scoreMap.put(second, scoreMap.get(second) + score);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(scoreMap.get('R') >= scoreMap.get('T') ? "R" : "T");
        sb.append(scoreMap.get('C') >= scoreMap.get('F') ? "C" : "F");
        sb.append(scoreMap.get('J') >= scoreMap.get('M') ? "J" : "M");
        sb.append(scoreMap.get('A') >= scoreMap.get('N') ? "A" : "N");

        return sb.toString();
    }
}