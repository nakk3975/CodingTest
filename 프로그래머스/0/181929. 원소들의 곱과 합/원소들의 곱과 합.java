class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int square = 1;
        for(int i = 0; i < num_list.length; i++) {
            square *= num_list[i];
            sum += num_list[i];
        }
        int sumSquare = (int)Math.pow(sum, 2);
        
        if(square < sumSquare) {
            answer = 1;
        }
        
        return answer;
    }
}