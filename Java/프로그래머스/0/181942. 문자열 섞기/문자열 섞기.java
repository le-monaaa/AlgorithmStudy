class Solution {
    public String solution(String str1, String str2) {
        char[] str1c = str1.toCharArray();
        char[] str2c = str2.toCharArray();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) answer.append(Character.toString(str1c[i]) + Character.toString(str2c[i]));
        return answer.toString();
    }
}