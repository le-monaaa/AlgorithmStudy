class Solution {
    public int solution(String s) {
        int sameCnt = 0;
        int diffCnt = 0;
        int result = 0;

        char base = s.charAt(0);

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == base) {
                sameCnt++;
            } else {
                diffCnt++;
            }
            
            if(sameCnt == diffCnt) {
                result++;
                sameCnt = 0;
                diffCnt = 0;
                
                if(i+1 < s.length()) {
                    base = s.charAt(i+1);
                }
            }
        }
        if(sameCnt + diffCnt > 0) {
            result++;
        }

        return result;
    }
}