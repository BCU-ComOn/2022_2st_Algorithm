import java.util.Scanner;

public class bj2525_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		
		
		if(b+c >= 60) {
			h = a + ((b+c)/60);
			m = (b+c) % 60;
		}
		else {
			h = a;
			m = b+c;
		}
		
		if(h > 23) {
			h = h - 24;
		}
		
		
		System.out.printf("%d %d", h, m);

	}

}
