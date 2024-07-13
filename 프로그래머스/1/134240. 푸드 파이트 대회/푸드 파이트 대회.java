class Solution {
    public String solution(int[] food) {
        String answer = "";
        String left = "";
        String right = "";

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left += i;
            }
        }

        for (int i = left.length() - 1; i >= 0; i--) {
            right += left.charAt(i);
        }

        answer = left + "0" + right;
        return answer;
    }
}