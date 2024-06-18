import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int distancePow = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);  // 두 원의 중심 사이의 거리의 제곱
            int addRadiusPow = (r1 + r2) * (r1 + r2);  // 두 원의 반지름의 합의 제곱
            int subRadiusPow = (r1 - r2) * (r1 - r2);  // 두 원의 반지름의 차의 제곱

            if (distancePow == 0) {
                if (r1 == r2) {
                    System.out.println(-1);  // 두 원이 일치하는 경우
                } else {
                    System.out.println(0);  // 두 원의 중심이 같지만 반지름이 다른 경우
                }
            } else {
                if (distancePow < subRadiusPow || distancePow > addRadiusPow) {
                    System.out.println(0);  // 한 원이 다른 원을 포함하거나 두 원이 서로 겹치지 않는 경우
                } else if (distancePow == subRadiusPow || distancePow == addRadiusPow) {
                    System.out.println(1);  // 두 원이 내접하거나 외접하는 경우
                } else {
                    System.out.println(2);  // 그 외의 경우
                }
            }
        }

        sc.close();
    }
}