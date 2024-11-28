import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] cnt = new int[number+1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                cnt[j]++;
            }
        }
        for(int i = 1; i <= number; i++) {
            if (cnt[i] > limit) {
                cnt[i] = power;
            }
        }

        return Arrays.stream(cnt).sum();
    }

}