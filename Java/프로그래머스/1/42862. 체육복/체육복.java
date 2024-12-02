import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 해시셋 변환
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        for(int num : lost) lostSet.add(num);
        for(int num : reserve) {
            if(lostSet.contains(num)) {
                lostSet.remove(num);
            } else {
                reserveSet.add(num);
            }
        }

        for(int l: new HashSet<>(lostSet)) {
            if(reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
                lostSet.remove(l);
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
                lostSet.remove(l);
            }
        }

        return n - lostSet.size();
    }
}