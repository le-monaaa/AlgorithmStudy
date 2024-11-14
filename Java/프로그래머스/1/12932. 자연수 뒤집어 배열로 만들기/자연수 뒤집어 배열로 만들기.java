import java.util.*;
class Solution {
    public int[] solution(long n) {
        List<Integer> ans = new ArrayList<>();
        while (n > 0) {
            ans.add((int)(n%10));
            n /= 10;
        }
        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}