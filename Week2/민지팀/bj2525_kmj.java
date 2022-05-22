package week02_22;

import java.util.Scanner;					//경모 : 수고하셨습니다

public class bj2525_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int time = b+c;
		
		while(time >= 60) {
			a += 1;
			time = time - 60;
			
			if(a >= 24) {
				a = 0;
			}
		}
		System.out.println(a + " " + time);
		
	}

}
