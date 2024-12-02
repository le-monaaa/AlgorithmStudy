import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> keymapcnt = new HashMap<>();

        for(int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for(int j = 0; j < key.length(); j++) {
                char c = key.charAt(j);
                keymapcnt.put(c, Math.min(keymapcnt.getOrDefault(c, Integer.MAX_VALUE), j + 1));
            }
        }
        
        int[] result = new int[targets.length];
        
        for(int i=0; i < targets.length; i++) {
            String targer = targets[i];
            int pressCnt = 0;
            
            for(char c: targer.toCharArray()) {
                if(!keymapcnt.containsKey(c)) {
                    pressCnt = -1;
                    break;
                }
                pressCnt += keymapcnt.get(c);
            }
            result[i] = pressCnt;
        }
        
        return result;
    }
}