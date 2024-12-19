class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for(int i = 3; i <= total; i++) {
            int height = total / i;
            if(2 * (i + height - 2) == brown && i >= height) {
                return new int[]{i, height};
            }
        }
        return null;
    }
}