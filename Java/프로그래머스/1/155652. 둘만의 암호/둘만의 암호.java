class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char a = s. charAt(i);
            int cnt = 0;
            
            while(cnt < index) {
                a++;
                if(a > 'z') {
                    a = 'a';
                }
                if(skip.indexOf(a) == -1) {
                    cnt++;
                }
            }
            sb.append(a);
        }
        return sb.toString();
    }
}