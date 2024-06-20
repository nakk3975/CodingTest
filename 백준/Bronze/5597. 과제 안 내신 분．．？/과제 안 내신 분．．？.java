import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isSubmitted = new boolean[31];
        Arrays.fill(isSubmitted, false);

        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            isSubmitted[studentNumber] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!isSubmitted[i]) {
                System.out.println(i);
            }
        }
    }
}