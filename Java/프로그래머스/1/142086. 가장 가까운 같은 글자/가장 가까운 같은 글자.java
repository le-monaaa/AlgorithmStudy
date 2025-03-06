import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = s.length()-1; i >= 0; i--){
            char target = s.charAt(i);
            int j = i-1;
            int cnt = 1;
            while(j >=0) {
                if(s.charAt(j) == target) {
                    answer[i] = cnt;
                    break;
                } else {
                    cnt++;
                    j--;
                }
            }
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}