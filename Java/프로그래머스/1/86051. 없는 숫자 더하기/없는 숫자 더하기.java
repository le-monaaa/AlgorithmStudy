class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int num_sum = 0;
        for (int x: numbers) {
            num_sum += x;
        }
        return answer - num_sum;
    }
}