class Solution {
    public int[] solution(long n) {
    
        String charN = String.valueOf(n);
        int[] answer = new int[charN.length()];
        
        for (int i = 0; i < answer.length; i++) {
            String one = charN.substring(answer.length-1-i, answer.length-i);
            answer[i] = Integer.parseInt(one);
        }
        
        return answer;
    }
}