import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reverseSet = new HashSet<>();

        for(int l : lost) lostSet.add(l);
        for(int r: reserve) {
            if(lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reverseSet.add(r);
            }
        }

        for(int r: reverseSet) {
            if(lostSet.contains(r -1)) {
                lostSet.remove(r-1);
            } else if (lostSet.contains(r+1)) {
                lostSet.remove(r+1);
            }
        }
        return n- lostSet.size();
    }
}