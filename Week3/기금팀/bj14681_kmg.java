import java.util.Scanner;

public class bj14681_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		int result = 0;
		
		if(x > 0 && y > 0) {
			result = 1;
		}
		else if(x < 0 && y > 0) {
			result = 2;
		}
		else if(x < 0 && y < 0) {
			result = 3;
		}
		else if(x > 0 && y < 0) {
			result = 4;
		}
		
		System.out.println(result);
		

	}

}
