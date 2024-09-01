import java.math.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] answer = new int[y + 1];
        
        for(int i = x; i <= y; i++) {
            if(i != x && answer[i] == 0) {
                answer[i] = -1;
                continue;
            }
            
            if(i + n <= y) {
                answer[i + n] = (answer[i + n] == 0) ? answer[i] + 1 : Math.min(answer[i] + 1, answer[i + n]);
                // if(answer[i + n] == 0) {
                //     answer[i + n] = answer[i] + 1;
                // } else {
                //     Math.min(answer[i] + 1, answer[i + n]);
                // }
            }
            
            if(i * 2 <= y) {
                if(answer[i * 2] == 0) {
                    answer[i * 2] = answer[i] + 1;
                } else {
                    Math.min(answer[i] + 1, answer[i * 2]);
                } 
            }
            
            if(i * 3 <= y) {
                if(answer[i * 3] == 0) {
                    answer[i * 3] = answer[i] + 1;
                } else {
                    Math.min(answer[i] + 1, answer[i * 3]);
                } 
            }
            

        }
        // 테스트 5, 7, 9, 14 번 실패
        return answer[y];
    }
}