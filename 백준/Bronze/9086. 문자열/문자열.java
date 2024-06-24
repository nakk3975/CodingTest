import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        int T = sc.nextInt();
        String result[] = new String[T];
        for(int i = 0; i < T; i++) {
            String S = sc.next();
            result[i] = S.substring(0,1) + S.substring(S.length() - 1, S.length());
        }
        sc.close();
        for(String end : result) {
            System.out.println(end);
        }
    }
}