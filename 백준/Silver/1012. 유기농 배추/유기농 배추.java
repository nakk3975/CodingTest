import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[][] worm;
    static int m, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();

            arr = new int[n][m];
            worm = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[y][x] = 1;
            }

            int count = 0;
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (arr[x][y] == 1 && !worm[x][y]) {
                    	cabbage(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    public static void cabbage(int x, int y) {
    	worm[x][y] = true;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] == 1 && !worm[nx][ny]) {
                	cabbage(nx, ny);
                }
            }
        }
    }
}