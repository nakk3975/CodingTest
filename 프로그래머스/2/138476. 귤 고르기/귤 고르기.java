import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> key = new ArrayList<>(map.keySet());
        key.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        for (Integer i : key) {
            if (k <= 0) {
                break;
            } else {
                answer++;
                k -= map.get(i);
            }
        }
        return answer;
    }
}