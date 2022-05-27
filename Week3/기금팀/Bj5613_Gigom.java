package ComonW6;
import java.util.Scanner;

public class Bj5613_Gigom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = sc.nextInt();
		
		while (true) {
			
			String str = sc.nextLine();
			
			if (str.equals("="))
				break;
			
			switch (str) {
			case "+":
				sum += sc.nextInt();
				break;
				
			case "-":
				sum -= sc.nextInt();
				break;
				
			case "*":
				sum *= sc.nextInt();
				break;
				
			case "/":
				sum /= sc.nextInt();
				break;
				
			default:
				break;
				
			}
		}
		sc.close();
		System.out.println(sum);
		
	}
	
}
	
