import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerIndex = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndex.put(players[i], i);
        }
        for (String call : callings) {
            int currentIndex = playerIndex.get(call);

            int previous = currentIndex -1;
            String previousPlayer = players[previous];
            
            players[previous] = call;
            players[currentIndex] = previousPlayer;
            
            playerIndex.put(call, previous);
            playerIndex.put(previousPlayer, currentIndex);
        }
            return players;
    }
}