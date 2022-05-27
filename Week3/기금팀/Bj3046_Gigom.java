import java.util.Scanner;

public class Bj3046_Gigom {
	//(r1+r2)/2 = s
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int s = sc.nextInt();
		int r2 = s*2-r1;
		System.out.println(r2);

	}

}