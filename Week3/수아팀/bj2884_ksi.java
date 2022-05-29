import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int H , M = 0;
		if(minute < 45) {
			M = 60-(45-minute);
			H = hour-1;
			if(H<0) {
				H = 23;
			}
		}
		else {
			H = hour;
			M = minute - 45;
		}

		
		System.out.println(H+" "+M);
	}

}

// 주연 : 한학기 동안 고생하셨습니다. 👍