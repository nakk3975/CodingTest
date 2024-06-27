import java.io.*;

public class Main {
    private static final int[] COUNT = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        solve(N);

        StringBuilder builder = new StringBuilder();
        for (int item : COUNT) {
            builder.append(item).append(" ");
        }

        writer.write(builder.toString().trim());
        writer.newLine();
        writer.flush();

        reader.close();
        writer.close();
    }

    private static void solve(int num) {
        int start = 1;
        int digit = 1;

        while (start <= num) {
            while (num % 10 != 9 && start <= num) {
                count(num, digit);
                num--;
            }

            if (num < start) {
                break;
            }

            while (start % 10 != 0 && start <= num) {
                count(start, digit);
                start++;
            }
            start /= 10;
            num /= 10;

            for (int i = 0; i < 10; i++) {
                COUNT[i] += (num - start + 1) * digit;
            }
            digit *= 10;
        }
    }

    private static void count(int num, int digit) {
        while (num > 0) {
            COUNT[num % 10] += digit;
            num /= 10;
        }
    }
}