public class Solution {

	public String solution(String s, int n) {
		String answer = "";
        
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
            
			if(ch == ' ') {
				answer += ch;
				continue;
			}
            // 대문자 65 ~ 90 소문자 97 ~ 122
			if (ch >= 'a' && ch <= 'z') {
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else {
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            }
		}
        
		return answer;
	}
}