class Solution {
    public int solution(int[] number) {
        int n = number.length;
        int answer = 0;
        for(int i = 0; i <n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
}