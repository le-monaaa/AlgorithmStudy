class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for(char c: X.toCharArray()) {
            cntX[c-'0']++;
        }
        for(char c: Y.toCharArray()) {
            cntY[c-'0']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 9; i >= 0; i--) {
            int minCnt = Math.min(cntX[i], cntY[i]);
            for(int j = 0; j < minCnt; j++) {
                sb.append(i);
            }
        }

        if(sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}