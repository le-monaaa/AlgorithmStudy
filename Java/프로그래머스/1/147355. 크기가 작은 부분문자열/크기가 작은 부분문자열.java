class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n = p.length();
        long num = Long.parseLong(p);
        for(int i = 0; i < t.length()-n + 1; i++) {
            if(Long.parseLong(t.substring(i, i+n)) <= num) answer++;
        }
        return answer;
    }
}