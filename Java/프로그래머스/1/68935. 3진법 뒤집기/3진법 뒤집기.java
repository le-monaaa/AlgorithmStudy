class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        ternary = new StringBuilder(ternary).reverse().toString();
        int decimal = Integer.parseInt(ternary, 3);
        return decimal;
    }
}