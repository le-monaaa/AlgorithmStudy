import java.util.*;
class Solution {
    public long solution(long n) {
        String[] nums = String.valueOf(n).split("");
        Arrays.sort(nums, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }

        return Long.parseLong(sb.toString());
    }
}