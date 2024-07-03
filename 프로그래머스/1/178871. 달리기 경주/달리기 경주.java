import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerToRank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerToRank.put(players[i], i + 1);
        }

        for (String calling : callings) {
            int rank = playerToRank.get(calling);
            if (rank > 1) {
                playerToRank.put(calling, rank - 1);
                playerToRank.put(players[rank - 2], rank);
                String temp = players[rank - 2];
                players[rank - 2] = calling;
                players[rank - 1] = temp;
            }
        }

        return players;
    }
}
