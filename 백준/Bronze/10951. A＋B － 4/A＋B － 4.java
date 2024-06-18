import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			String[] numbers = str.split(" ");
			int a = Integer.parseInt(numbers[0]);
			int b = Integer.parseInt(numbers[1]);
			System.out.println(a + b);
		
		}
	}
}