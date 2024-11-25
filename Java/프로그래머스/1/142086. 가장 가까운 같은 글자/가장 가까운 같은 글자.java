class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0; i < s.length(); i++) {
            boolean found = false;
            int j = i -1;
            int cnt = 1;
            while (j >= 0) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = cnt;
                    found = true;
                    break;
                }
                cnt++;
                j--;
            }
            if (!found) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}