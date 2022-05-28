package week03_22;

import java.util.Scanner;

public class bj2884_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		
		if(m < 45) {
			m = 60+(m-45);
			
			if(h == 0) {
				h = 24 - 1;
			} else {
				h -= 1;
			}
		}
		else if(m >= 45) {
			m = m-45;
		}

		System.out.println(h + " " + m);
	}

}
