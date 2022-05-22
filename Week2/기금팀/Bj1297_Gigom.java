package ComonW6;
import java.util.Scanner;

public class Bj1297_Gigom {

	public static void main(String[] args) {	// 민규 : 수고하셨습니다 :)
		Scanner sc = new Scanner (System.in);
		int D = sc.nextInt(); //대각선길이
		int H = sc.nextInt(); //높이
		int W = sc.nextInt(); //너비
		sc.close();
		/*피타고라스의 정리
		a = 높이 b = 너비 c = 대각선의 길이
		c^2 = a^2 + b^2
		*/
		double R = Math.pow(D,2)/(Math.pow(W,2)+Math.pow(H, 2));
		System.out.print((int)Math.sqrt(R * Math.pow(H,2)) + " " + (int)Math.sqrt(R * Math.pow(W, 2)));
		//Math.sqrt(x) ==> 매개변수는 x를 가지며 주어진 x에 루트를 입히고 그값을 반환 x값이 음수일시 NAN반환
		//double타입의 값을 integer형으로 변환하여 출력문에 넣는다.
	}

}
