import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N+1];

        for (int i = 1; i <= N; i++) {
            array[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            int[] temp = new int[J-I+1];

            for (int j = I; j <= J; j++) {
                temp[j-I] = array[j];
            }

            for (int j = I; j <= J; j++) {
                array[j] = temp[J-j];
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}