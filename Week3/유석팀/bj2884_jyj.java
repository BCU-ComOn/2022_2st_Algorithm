
import java.util.Scanner;

public class bj2884_jyj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int x = M - 45;

		if (H < 24 && H > -1) {
			if (x < 0) {
				x = Math.abs(x);
				x = 60 - x;
				H--;
				if (H < 0) {
					H = 23;
				}
			}
		}
		System.out.println(H + " " + x);

	}

}
//유석 : 고생하셨습니다