import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int num = 0;
        if ( num_list[size-1] > num_list[size-2]) {
           num = num_list[size-1] - num_list[size-2]; 
        } 
        else {
            num = num_list[size-1] * 2;
        }
        int[] answer = Arrays.copyOf(num_list, size+1);
        answer[size] = num;
        
        return answer;
    }
}