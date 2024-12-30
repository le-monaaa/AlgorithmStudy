class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];

        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }
        return lcm;
    }
    private int getGCD (int a, int b) {
        if ( b == 0) return a;
        return getGCD(b, a%b);
    }
    private int getLCM(int a, int b) {
        return a / getGCD(a, b) * b;
    }
}