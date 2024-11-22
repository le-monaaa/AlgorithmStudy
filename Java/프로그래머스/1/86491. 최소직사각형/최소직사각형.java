class Solution {
    public int solution(int[][] sizes) {
        int size1 = 0;
        int size2 = 0;
        for(int[] card : sizes) {
            if (card[1] > card[0]) {
                int temp = card[0];
                card[0] = card[1];
                card[1] = temp;
            }
            if (size1 < card[0]) {
                size1 = card[0];
            }
            if (size2 < card[1]) {
                size2 = card[1];
            }
        }
        int answer = size1 * size2;
        return answer;
    }
}