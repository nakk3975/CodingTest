import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder str = new StringBuilder(new String(c));
        answer = str.reverse().toString();
        return answer;
    }
}