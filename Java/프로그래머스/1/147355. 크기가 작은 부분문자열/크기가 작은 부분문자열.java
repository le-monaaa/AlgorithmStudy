class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        int cnt = 0;

        for(int i=0; i<=t.length()-pLen; i++){
            String part = t.substring(i, i+pLen);

            if (part.compareTo(p) <= 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
