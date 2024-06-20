import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = 0;
        double sum = 0.0;
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        for (int i = 0; i < N; i++) {
            sum += ((double) scores[i] / max * 100);
        }

        System.out.println(sum / N);
    }
}