class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] tmp = s.split(" ");
        int min, max, num;
        
        min = Integer.parseInt(tmp[0]);
        max = Integer.parseInt(tmp[0]);
        
        for (int i = 1; i < tmp.length; i++) {
            num = Integer.parseInt(tmp[i]);
            
            if(min > num) {
                min = num;
            }
            if(max < num) {
                max = num;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}