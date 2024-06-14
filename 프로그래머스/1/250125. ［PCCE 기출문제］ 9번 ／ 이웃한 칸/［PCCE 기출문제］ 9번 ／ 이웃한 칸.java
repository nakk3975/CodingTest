class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        for(int i = 0; i < 4; i++) {
            int xCheck = h + x[i];
            int yCheck = w + y[i];
            if((0 <= xCheck && xCheck < board.length) 
               && (0 <= yCheck && yCheck < board.length)) {
                if(board[xCheck][yCheck].equals(board[h][w])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}