import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        boolean found = false;
        for (int length = L; length <= 100; length++) {
            int start = (2 * N - length * (length - 1)) / (2 * length);
            if (start >= 0 && N == (2 * start + length - 1) * length / 2) {
                for (int i = 0; i < length; i++) {
                    System.out.print((start + i) + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
        sc.close();
    }
}