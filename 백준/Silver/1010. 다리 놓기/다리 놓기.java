import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> results = new ArrayList<>();
        int T = sc.nextInt();
        long[][] dp = new long[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][0] = dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            results.add(dp[M][N]);
        }

        for (Long result : results) {
            System.out.println(result);
        }

        sc.close();
    }
}