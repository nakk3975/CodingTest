import java.util.*;

// 첫번째 일부 메모리 초과
class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)right - (int)left + 1;
        int[] answer = new int[(int)length];
        
        int idx= 0;
        for (long i = left; i <= right; i++) {
            long row = i / n + 1;
            long col = i % n + 1;
            answer[idx++] = (int) Math.max(row, col);
        }
        
        return answer;
    }
}