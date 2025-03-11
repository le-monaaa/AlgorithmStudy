class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0;
        for (int s: section) {
            if ( s > lastPainted) {
                answer++;
                lastPainted = s + m - 1;
            }
        }
        return answer;
    }
}