class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long resultPrice = 0;
        for(int i = 1; i <= count; i++) {
            resultPrice = resultPrice + (price * i);
        }
        
        money = money - resultPrice;
        
        if(money < 0) {
            answer = -money;
        } else if(money == 0) {
            answer = 0;
        }
        
        return answer;
    }
}