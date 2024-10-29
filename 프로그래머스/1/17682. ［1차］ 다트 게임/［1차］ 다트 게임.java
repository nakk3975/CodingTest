class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // 라운드당 점수
        int[] score = new int[3];
        char[] arr = dartResult.toCharArray();
        int idx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1' && arr[i + 1] == '0') {
                idx++;
                score[idx] = 10;
                i++;
                continue;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                idx++;
                score[idx] = Integer.parseInt(String.valueOf(arr[i]));
                continue;
            }
            
            switch (arr[i]) {
                case 'D':
                    score[idx] = (int) Math.pow(score[idx], 2);
                    break;
                case 'T':
                    score[idx] = (int) Math.pow(score[idx], 3);
                    break;
                case '*':
                    score[idx] *= 2;
                    if (idx - 1 >= 0) {
                        score[idx - 1] *= 2;
                    }
                    break;
                case '#':
                    score[idx] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];

        return answer;
    }
}