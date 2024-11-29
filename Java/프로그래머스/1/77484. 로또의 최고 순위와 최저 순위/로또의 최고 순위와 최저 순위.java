import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int undefined = 0;
        int correct = 0;
        
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }
        
        for(int lotto: lottos) {
            if (lotto == 0) {
                undefined++;
            } else if (winSet.contains(lotto)){
                correct++;
            }
        }
        
        int minRank = getRank(correct);
        int maxRank = getRank(undefined + correct);

        return new int[]{maxRank, minRank};
    }

    private int getRank(int cnt) {
        switch (cnt) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}