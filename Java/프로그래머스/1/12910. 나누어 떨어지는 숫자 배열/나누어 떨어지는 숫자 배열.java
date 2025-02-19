import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        Integer[] intArr = Arrays.stream(arr)
            .boxed()
            .toArray(Integer[]::new);
        Arrays.sort(intArr);
        for(int num : intArr) {
            if(num%divisor==0) {
                answer.add(num);
            }
        }
        if(answer.size() == 0) {
            return new int[]{-1};
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}