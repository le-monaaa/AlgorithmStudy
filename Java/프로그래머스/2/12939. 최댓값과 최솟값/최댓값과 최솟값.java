import java.util.*;

class Solution {
    public String solution(String s) {
        int[] numbers = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        StringBuilder answer = new StringBuilder();
        answer.append(Arrays.stream(numbers).min().orElse(0));
        answer.append(" ");
        answer.append(Arrays.stream(numbers).max().orElse(0));

        return answer.toString();
    }
}