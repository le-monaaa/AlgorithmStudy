class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        if (num2 == 1) {
            return 0;
        }
        while (num2 != 1) {
            if (answer == 501) {
                return -1;
            }
            if (num2 % 2 == 0) {
                num2 /= 2;
            } else {
                num2 = num2 * 3 + 1;
            }
            answer += 1;
        }
        return answer;
    }
}