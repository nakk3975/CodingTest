import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
        	String result = "";
        	int num = sc.nextInt();
        	String stringInput = sc.next();
        	for(int k = 0; k < stringInput.length(); k++) {
        		for(int j = 0; j < num; j++) {
        			result += stringInput.charAt(k);        				
        		}	
        	}
            System.out.println(result);
        }
        sc.close();
    }
}