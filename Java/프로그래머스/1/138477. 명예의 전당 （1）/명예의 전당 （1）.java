import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s: score) {
            pq.add(s);
            if(pq.size() > k) {
                pq.poll();
            }
            answer.add(pq.peek());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}