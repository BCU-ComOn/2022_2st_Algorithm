package week2;

import java.util.Scanner;

public class num_2 {

	public static void main(String[] args) {
		// 오븐 시계
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		int c = in.nextInt();
		
		m += c;
		if(m >= 60) {
			while(m >= 60) {
				m -= 60;
				h++;
				if(h >= 24) {
					h = 0;
				}
			}
		}
		System.out.println(h + " " + m);
	}

}
//민석 : 고생하셨습니다.