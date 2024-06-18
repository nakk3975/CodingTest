import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;

            for (int j = 0; j < n; j++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();
                if ((Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2) < Math.pow(r, 2)) ^ (Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2) < Math.pow(r, 2))) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
