import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();

        int[][] vortex = new int[r2 - r1 + 1][c2 - c1 + 1];
        int max = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                vortex[i - r1][j - c1] = calculate(i, j);
                max = Math.max(max, vortex[i - r1][j - c1]);
            }
        }

        // 가장 긴 수의 자리수 계산
        int maxDigits = String.valueOf(max).length();

        // 출력
        for (int i = 0; i <= r2 - r1; i++) {
            for (int j = 0; j <= c2 - c1; j++) {
                System.out.printf("%" + maxDigits + "d ", vortex[i][j]);
            }
            System.out.println();
        }
    }

    static int calculate(int row, int column) {
        int border = Math.max(Math.abs(row), Math.abs(column));
        int min = (int) Math.pow(2 * border - 1, 2) + 1;

        if (row == border) {
            return min + 7 * border - 1 + column;
        }

        if (column == -border) {
            return min + 5 * border - 1 + row;
        }

        if (row == -border) {
            return min + 3 * border - 1 - column;
        }

        return min + border - 1 - row;
    }
}
