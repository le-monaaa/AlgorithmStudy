class Solution {
    public int solution(int n) {
        int a = 0, b = 1, temp;

        for (int i = 2; i <= n; i++) {
            temp = (a + b) % 1234567;
            a = b;
            b = temp;
        }

        return b;
    }
}