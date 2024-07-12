import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int box = score.length / m;
        Arrays.sort(score);
        
        if(score.length % m == 0) {
            for(int i = 0; i < box; i++) {
                answer += (score[i * m]) * m * 1;
            }
        } else {
            int num = score.length % m;
            for(int i = 0; i < box; i++) {
                int idx = num + (i * m);
                answer += score[idx] * m * 1;
            }
        }
        
        return answer;
    }
}