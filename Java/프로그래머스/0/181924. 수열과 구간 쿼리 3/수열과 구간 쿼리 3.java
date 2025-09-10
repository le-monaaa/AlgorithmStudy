class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         int[] answer = arr.clone();
        for(int[] q: queries) {
            int i = q[0];
            int j = q[1];
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        return answer;
    }
}