class Solution {
    public String solution(String code) {
        String mode = "0";
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char w = code.charAt(i);
            
            if ( w == '1') {
                mode = mode.equals("0") ? "1" : "0";
                continue;
            }
            if (mode.equals("0") && i % 2 == 0) {
                ret.append(w);
            } else if (mode.equals("1") && i % 2 == 1) {
                ret.append(w);
            }
        }
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
}