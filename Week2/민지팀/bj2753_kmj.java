package week02_22;

import java.util.Scanner;					//경모 : 수고하셨습니다
											//현우 :고생하셨습니다
public class bj2753_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println(1);
		} else if(year%100==0 && year%400 != 0 ) {
			System.out.println(0);
		} else if(year%400 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}
}
