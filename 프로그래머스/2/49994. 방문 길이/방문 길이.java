class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        
        int map[][] = new int[11][11];
        boolean visits[][][] = new boolean[11][11][4];
        
        int x = 5;
        int y = 5;
        
        for(int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int d = 0;
            if(c == 'U') {
                d = 0;
            } else if(c == 'L') {
                d = 1;
            } else if(c == 'D') {
                d = 2;
            } else {
                d = 3;
            }
            
            int ny = y + dy[d];
            int nx = x + dx[d];
            
            if(ny < 0 || nx < 0 || ny >= 11 || nx >= 11) {
                continue;
            }
            if(!visits[ny][nx][d]) {
                visits[ny][nx][d] = true;
                if(d % 2 == 0) {
                    d = 2 - d;
                } else {
                    d = 4 - d;
                }
                visits[y][x][d] = true;
                answer++;
            }
            y = ny;
            x = nx;
        }
        return answer;
    }
}