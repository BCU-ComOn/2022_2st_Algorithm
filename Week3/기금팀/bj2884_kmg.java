import java.util.Scanner; // 기곰: 고생하셨어요!

public class bj2884_kmg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		sc.close();
		
		if(m-45 < 0) {
			m = 60+(m-45);
			if(h-1 < 0) {
				h = 23;
			}
			else {
				h--;
			}
			
		}
		else {
			m = m - 45;
		}
		
		System.out.printf("%d %d", h, m);
		
	
	}
}
