import java.util.*;
import java.io.*;

public class Main {
    static int[] time;
    static int[] result;
    static List<List<Integer>> list;
    static int[] indegree;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            time = new int[N + 1];
            result = new int[N + 1];
            list = new ArrayList<>();
            indegree = new int[N + 1];

            for (int i = 0; i <= N; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 1; i <= N; i++) {
                time[i] = sc.nextInt();
            }

            for (int i = 0; i < K; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                list.get(X).add(Y);
                indegree[Y]++;
            }

            int W = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) {
                    queue.add(i);
                    result[i] = time[i];
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int i = 0; i < list.get(current).size(); i++) {
                    int next = list.get(current).get(i);
                    result[next] = Math.max(result[next], result[current] + time[next]);

                    indegree[next]--;

                    if (indegree[next] == 0) {
                        queue.add(next);
                    }
                }
            }

            System.out.println(result[W]);
            
        }
        sc.close();
    }
}