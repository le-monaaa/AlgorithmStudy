class Solution {
    public String solution(String X, String Y) {
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        for(int i = 0; i < X.length(); i++) {
            xCnt[X.charAt(i)-48] += 1;
        }
        for(int i = 0; i < Y.length(); i++) {
            yCnt[Y.charAt(i)-48] += 1;
        }
        StringBuilder answer = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            answer.append(String.valueOf(i).repeat(Math.min(xCnt[i], yCnt[i])));
        }
        if(answer.length() == 0) return "-1";
        if(answer.charAt(0) == '0') return "0";
        return answer.toString();
    }
}