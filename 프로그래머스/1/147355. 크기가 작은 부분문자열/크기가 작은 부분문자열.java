class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            long dif = Long.parseLong(t.substring(i, i + len));
            if (dif <= num) answer++;
        }
        return answer;
    }
}
