import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> sumSet = new HashSet<>();
        
        int length = elements.length;

        for(int size = 1; size <= length; size ++) {
            int sum = 0;
            int start = 0;

            for(int i = 0; i < size; i++) {
                sum += elements[i];
            }
            sumSet.add(sum);
            
            while(start < length - 1) {
                sum -= elements[start];
                sum += elements[(start+size)%length];
                start++;
                sumSet.add(sum);
            }
        }
        answer = sumSet.size();
        return answer;
    }
}