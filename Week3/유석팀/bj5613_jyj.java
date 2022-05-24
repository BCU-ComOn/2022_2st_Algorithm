import java.util.Scanner;

public class bj5613_jyj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (true) {
			String a = sc.next();
			if (a.equals("=")) {
				break;
			}

			int y = sc.nextInt();
			if (a.equals("+")) {
				x += y;
			} else if (a.equals("-")) {
				x -= y;
			} else if (a.equals("*")) {
				x *= y;
			} else if (a.equals("/")) {
				x /= y;
			}
		}
		System.out.println(x);
	}
}
