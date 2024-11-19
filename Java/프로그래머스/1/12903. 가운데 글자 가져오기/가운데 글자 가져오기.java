class Solution {
    public String solution(String s) {
        int mid = s.length()/2;
        if(s.length()%2==0) {
            s = s.substring(mid-1, mid+1);
        } else {
            s = s.substring(mid, mid+1);
        }
        return s;
    }
}