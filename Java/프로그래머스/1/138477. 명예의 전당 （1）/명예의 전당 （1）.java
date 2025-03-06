import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int s: score) {
            minHeap.add(s);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
            result.add(minHeap.peek());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}