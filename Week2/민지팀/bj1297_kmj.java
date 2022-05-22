package week02_22;

import java.util.Scanner;					//경모 : 수고하셨습니다

public class bj1297_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		double de = Math.sqrt(Math.pow(h,2) + Math.pow(w, 2));
		
		int height = (int) Math.floor(h*(d/de));
		int width = (int) Math.floor(w*(d/de));
		
		System.out.println(width + " " + height);
	}

}
