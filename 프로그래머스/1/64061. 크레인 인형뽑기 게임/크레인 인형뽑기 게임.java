import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            int column = move - 1; 

            for (int row = 0; row < board.length; row++) {
                if (board[row][column] != 0) {
                    int doll = board[row][column];
                    board[row][column] = 0; 

                    if (!basket.isEmpty() && basket.get(basket.size() - 1).equals(doll)) {
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    } else {
                        basket.add(doll);
                    }
                    break; 
                }
            }
        }
        return answer;
    }
}