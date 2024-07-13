import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temple = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            temple.add(score[i]);
            Collections.sort(temple, Collections.reverseOrder());

            if (temple.size() > k) {
                temple.remove(temple.size() - 1);
            }

            answer[i] = temple.get(temple.size() - 1);
        }

        return answer;
    }
}