class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroCnt = 0;
        while(!s.equals("1")){
            int oneCnt = 0;

            for(char c: s.toCharArray()){
                if(c=='0') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }
            s = Integer.toBinaryString(oneCnt);
            cnt++;
        }
        return new int[]{cnt, zeroCnt};
    }
}