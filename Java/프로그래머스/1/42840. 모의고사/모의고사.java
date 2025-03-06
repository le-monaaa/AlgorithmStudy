import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = new int[]{1, 2, 3, 4, 5};
        int[] num2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if(ans == num1[i%5]) scores[0] += 1;
            if(ans == num2[i%8]) scores[1] += 1;
            if(ans == num3[i%10]) scores[2] += 1;
        }
        int maxScore = Arrays.stream(scores).max().getAsInt();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(scores[i] == maxScore) {
                result.add(i+1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}