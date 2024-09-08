class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // 문자열 s의 길이가 4 혹은 6이고
        if(s.length() == 4 || s.length() == 6){
            try {
                // 정부 변환
                int x = Integer.parseInt(s);
                // 문제 없이 성공 시 true
                answer = true;
            // 예외 시 false
            } catch(NumberFormatException e){
                answer = false;
            }
        // 문자열 s의 길이가 다르면 false
        } else {
            answer = false;
        }
        return answer;
    }
}