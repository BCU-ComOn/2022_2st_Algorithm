package ComonW6;
import java.util.Scanner;

public class Bj2525_Gigom {		// 민규 : 수고하셨습니다 :)

	public static void main(String[] args) {
		int[] t = new int[2]; //크기가 2인 배열 t 를 생성
		Scanner sc = new Scanner(System.in);
		t[0] = sc.nextInt();
		t[1] = sc.nextInt() + sc.nextInt();
		sc.close();
		//t[0] = 시 t[1] = 분
		while(t[1]>59) { //분이 59가 넘어가게 되면은 시간에 1이 더해지고 분은 60을 뺀값이 된다.
			t[0]++;
			t[1]-= 60;
		}
		while (t[0]>23) //위 분과 같이 시간도 23이 넘어가게되면은 시간은 24를 뺀값이 된다.
			t[0]-= 24;
		System.out.println(t[0] + " " + t[1]);
	}
}