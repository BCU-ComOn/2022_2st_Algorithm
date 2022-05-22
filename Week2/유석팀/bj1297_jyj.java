import java.util.Scanner;

public class bj1297_jyj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();

		double x = Math.sqrt(1.0*D*D/(H*H+W*W));
		System.out.println((int) Math.floor(x*H)+" "+(int) Math.floor(x*W));
		sc.close();
	}
}
