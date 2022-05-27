import java.util.Scanner;
public class Bj14861_Gigom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r;
		sc.close();
		
		if(x>0) {
			if(y>0) {
				r = 1;
			}else {
				r = 4;
			}
		} else {
			if(y>0) {
				r = 2;
			} else {
				r = 3;
			}
		}
		System.out.println(r);
	}

}