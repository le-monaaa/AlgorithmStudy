import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            answer[i] = Arrays.stream(temp).sorted().toArray()[commands[i][2]-1];
        }
        return answer;
    }
}