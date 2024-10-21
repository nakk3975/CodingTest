import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        // 0 1 3 5 6
        // 0 인용 수 5
        // 1 인용 수 4
        // 3 인용 수 3
        // 5 인용 수 2
        // 6 인용 수 1

        int answer = 0;
        
        Arrays.sort(citations);
		
		for(int i = 0; i < citations.length; i++) {
			int h = citations.length - i; // 논문 인용 횟수
			
			if(citations[i] >= h) {
				answer = h;
				break;
			}
		}
        return answer;
    }
}