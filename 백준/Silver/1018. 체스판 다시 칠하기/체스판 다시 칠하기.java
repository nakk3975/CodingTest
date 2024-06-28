import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changes = countChanges(board, i, j);
                minChanges = Math.min(minChanges, changes);
            }
        }

        System.out.println(minChanges);
        scanner.close();
    }

    private static int countChanges(char[][] board, int row, int col) {
        int changes1 = 0;
        int changes2 = 0;

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                char expectedColor1 = (i + j) % 2 == 0 ? 'W' : 'B';
                char expectedColor2 = (i + j) % 2 == 0 ? 'B' : 'W';

                if (board[i][j] != expectedColor1) {
                    changes1++;
                }
                if (board[i][j] != expectedColor2) {
                    changes2++;
                }
            }
        }

        return Math.min(changes1, changes2);
    }
}
