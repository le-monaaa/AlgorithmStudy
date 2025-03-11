import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matched = 0;
        Set<Integer> winSet = new HashSet<>();
        for(int num : win_nums) {
            winSet.add(num);
        }

        for(int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else if (winSet.contains(num)) {
                matched++;
            }
        }
        int maxRank = getRank(zeroCnt + matched);
        int minRank = getRank(matched);
        return new int[]{maxRank, minRank};
    }
    private int getRank(int cnt) {
        return switch (cnt) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };

    }
}