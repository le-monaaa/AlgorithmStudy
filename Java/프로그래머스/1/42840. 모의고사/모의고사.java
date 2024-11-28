import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[][] students = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] scores = new int[students.length]; // score

        for(int i=0; i< answers.length; i++) {
            for (int st = 0; st < students.length; st++) {
                if (answers[i] == students[st][i % students[st].length]) {
                    scores[st]++;
                }
            }
        }
        int maxScore = Arrays.stream(scores).max().orElse(0);

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}