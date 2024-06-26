import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        long min = sc.nextLong();
        long max = sc.nextLong();
        
        boolean[] isNumber = new boolean[(int) (max - min + 1)];
        
        for (long i = 2; i * i <= max; i++) {
            long x = min / (i * i);
            if (min % (i * i) != 0) {
                x++;
            }
            while (x * (i * i) <= max) {
                isNumber[(int) (x * i * i - min)] = true;
                x++;
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < max - min + 1; i++) {
            if (!isNumber[i]) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}