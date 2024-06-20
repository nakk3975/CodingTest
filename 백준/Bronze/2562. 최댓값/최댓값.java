import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = 0;
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}