import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if(X>0) {
			if(Y>0) {
				System.out.println(1);
			}
			else if(Y<0) {
				System.out.println(4);
			}
		}
		else if(X<0) {
			if(Y>0) {
				System.out.println(2);
			}
			else if(Y<0) {
				System.out.println(3);
			}
		}
	}

}
//수아: 좋은 코드 ! 수고하셨습니당