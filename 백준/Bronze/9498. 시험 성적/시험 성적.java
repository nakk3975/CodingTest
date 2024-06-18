import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		String result = "";
		
		if(score < 60) {
			result = "F";
		} else if(score < 70) {
			result = "D";
		} else if(score < 80) {
			result = "C";
		} else if(score < 90) {
			result = "B";
		} else {
			result = "A";
		}
		
		System.out.println(result);
	}

}