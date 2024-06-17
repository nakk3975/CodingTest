import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private void solution() {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();
        
        // 큰 값이 a, 작은 값이 b가 되도록 설정
        int a = Math.max(p, q);
        int b = Math.min(p, q);

        // b가 1이거나 (b가 2이고 d가 2로 나누어 떨어지면) 또는 d가 a 또는 b로 나누어 떨어지면
        if (b == 1 || (b == 2 && d % 2 == 0) || d % a == 0 || d % b == 0) {
            System.out.println(d);
            return;
        }

        int limit = d / a + 1; // a의 배수로 가능한 최대 개수
        int answer = Integer.MAX_VALUE; // 최소 값을 찾기 위해 최대 값으로 초기화
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for (int i = 0; i <= limit; i++) {
            int remain = d - a * i; // a의 배수만큼 뺀 나머지 금액

            if (remain >= 0 && remain % b == 0) { // 나머지가 b로 나누어 떨어지면
                System.out.println(d);
                return;
            }

            if (remain < 0) remain += b; // 남은 금액이 음수일 때 보정
            int tmp = b - remain % b; // 남은 금액을 b로 채우기 위한 보정값

            if (seen.containsKey(tmp)) break; // 무한 루프 방지
            seen.put(tmp, true); // 보정값을 저장

            answer = Math.min(answer, tmp); // 최소 값 업데이트
        }
        System.out.println(d + answer); // 최종 금액 출력
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}