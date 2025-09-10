class Solution {
    public String solution(int[] numLog) {
        int size = numLog.length;
        StringBuilder answer = new StringBuilder();
        int n = numLog[0];
        for(int i = 0; i < size-1; i++) {
            if(numLog[i+1] == n + 1) {
                n += 1;
                answer.append("w");
            } else if ( numLog[i+1] == n - 1) {
                n -= 1;
                answer.append("s");
            } else if ( numLog[i+1] == n + 10) {
                n += 10;
                answer.append("d");
            } else {
                n -= 10;
                answer.append("a");
            }
        }
        
        return answer.toString();
    }
}