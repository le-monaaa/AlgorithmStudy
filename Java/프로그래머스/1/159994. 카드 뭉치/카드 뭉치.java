class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        for(String s: goal) {
            if(i < cards1.length && s.equals(cards1[i])) {
                i++;
            } else if (j < cards2.length && s.equals(cards2[j])) {
                j++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}