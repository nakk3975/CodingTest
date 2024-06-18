import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String a = "int";
		int b = N / 4;
		for(int i = 1; i <= b; i++) {
			a = "long " + a;
		}
		System.out.println(a);
		sc.close();
	}
}