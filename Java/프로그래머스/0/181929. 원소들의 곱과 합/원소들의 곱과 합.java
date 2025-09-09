class Solution {
    public int solution(int[] num_list) {
        int sum = num_list[0];
        int mul = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        return mul < sum*sum ? 1 : 0;
    }
}