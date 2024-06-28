import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < N; i++) {
        	sum += Character.getNumericValue(num.charAt(i));
        }
        sc.close();
        System.out.println(sum);
    }
}
