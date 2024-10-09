class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while(true){
            n++;
            int next = Integer.bitCount(n);

            if(count == next){
                break;
            }
        }
        answer = n;
        
        return answer;
    }
}