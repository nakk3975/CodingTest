// 첫번째 num이 int형이라 오버플로우 발생
// 입력값을 long으로 바꾸니 해결
class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            
            answer++;
            
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}