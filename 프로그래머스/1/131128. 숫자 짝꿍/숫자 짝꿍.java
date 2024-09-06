import java.util.Arrays;

// String으로 바로 넣으니 시간 초과
class Solution {
    public String solution(String X, String Y) {
        char[] charX = X.toCharArray();
        char[] charY = Y.toCharArray();
        Arrays.sort(charX);
        Arrays.sort(charY);
        
        StringBuilder answer = new StringBuilder();
        int idxX = charX.length -1;
        int idxY = charY.length -1;
        
        while(idxX >= 0 && idxY >= 0){
            if(charX[idxX] == charY[idxY]){
                answer.append(charX[idxX]);
                idxX--;
                idxY--;
            }
            else if (charX[idxX] > charY[idxY]) {
                idxX--;
            } else {
                idxY--;
            }
        }
        
        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.toString().matches("0+")) {
            return "0";
        }
        
        return answer.toString();
    }
}