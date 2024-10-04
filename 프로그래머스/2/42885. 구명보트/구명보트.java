import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 정렬 50 50 70 80
        Arrays.sort(people);
        
        int min = 0;
        
        for (int max = people.length - 1; min <= max; max--){
            // max 80 > x answer + 1
            // max 70 > x answer + 1
            // max 50 > o answer + 1
            if (people[min] + people[max] <= limit) {
                min++;
            } 
            answer++;
        }
        
        return answer;
    }
}