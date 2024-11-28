class Solution {
    public int solution(int n, int m, int[] section) { // n: 전체 길이, m: 롤러 길이
        int endPoint = 0;
        int cnt = 0;
        
        for(int sec: section) {
            if(sec > endPoint) {
                endPoint = sec + m - 1;
                cnt++;
            }
        }

        return cnt;
    }
}