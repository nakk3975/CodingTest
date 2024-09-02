import java.util.*;

class Solution {
    // 첫번 째 코드 실행 성공, 제출 후 채첨 실패
    // 두번 째 런타임 에러
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int i = 0; i < discount.length - 9; i++) {
            int j = 0;
            for (j = 0; j < want.length; j++) {
                int check = 0;
                for (int k = i; k < i + 10; k++) {
                    if (discount[k].equals(want[j])) check++;
                }
                if (check < number[j]) {
                    break;
                }
            }
            if (j == want.length) answer++;
        }
        return answer;
    }
}