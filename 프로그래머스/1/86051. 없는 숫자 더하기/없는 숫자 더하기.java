class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i <= 9; i++) {
            int num = 0;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == i) {
                    num = 0;
                    break;
                } else {
                    num = i;
                }
            }
            answer += num;
            
        }
        return answer;
    }
}