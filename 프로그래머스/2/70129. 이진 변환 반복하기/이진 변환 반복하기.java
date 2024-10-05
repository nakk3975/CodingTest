class Solution {
    public int[] solution(String s) {
        // s에서 0을 제거 후
        // 남은 값의 길이를 2진 변화 후 다시 0을 제거
        // 반복해서 1이 될때까지
        int[] answer = new int[2];
        int zero = 0;
        int count = 0;
        int l = 0;
        
        while(!s.equals("1")){
            zero++;
            l = 0;
            
            for(int i = 0; i < s.length();i++){
                if(s.charAt(i) == '0'){
                  count++;  
                } else{
                  l++;
                }
            }         
            
            s = Integer.toBinaryString(l);
        }
        
        answer[0] = zero;
        answer[1] = count;
        return answer;
    }
}