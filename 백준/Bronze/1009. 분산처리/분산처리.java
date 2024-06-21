import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            for(int j = 0; j < b; j++) {
                result *= a;
                result %= 10;
            }
            if(result == 0)
                result = 10;
            list.add(result);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }
}