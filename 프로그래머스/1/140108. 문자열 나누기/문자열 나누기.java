public class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        int index = 0;

        while (index < length) {
            char x = s.charAt(index);
            int count = 0;
            int otherCount = 0;

            while (index < length) {
                if (s.charAt(index) == x) {
                    count++;
                } else {
                    otherCount++;
                }
                index++;

                if (count == otherCount) {
                    break;
                }
            }
            answer++;
        }
        return answer;
    }
}