class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a==b) {
            return a;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while(a <= b) {
            answer += a;
            a++;
        }
        return answer;
    }
}