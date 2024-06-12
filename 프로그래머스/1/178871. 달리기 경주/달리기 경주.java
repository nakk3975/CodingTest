import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

		HashMap<String, Integer> playerMap = new HashMap<>();
		HashMap<Integer, String> rankMap = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			playerMap.put(players[i], i);
			rankMap.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {

			int currentRank = playerMap.get(callings[i]);
			String player = rankMap.get(currentRank);

			String frontPlayer = rankMap.get(currentRank - 1);

			playerMap.put(player, currentRank - 1);
			playerMap.put(frontPlayer, currentRank);

			rankMap.put(currentRank - 1, player);
			rankMap.put(currentRank, frontPlayer);
		}

		for (int i = 0; i < players.length; i++) {
			answer[i] = rankMap.get(i);
		}
        return answer;
    }
}