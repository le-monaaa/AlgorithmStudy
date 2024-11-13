import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>(n);
        answer.add((long) x);
        for(int i = 2; i <= n ; i++) {
            answer.add((long) x * i);
        }

        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}