package ComonW6;
import java.util.Scanner;
/*
윤년연도

 1.1 4의배수일 경우 0
 
 	 2.1 4의 배수이면서 400의 배수일 경우 0
 	 2.2 4의 배수이면서 100의 배수일 경우 0
 	 2.3 else
 	 
 1.2 else
 
*/
public class Bj2753_Gigom {
	public static int input() {		// 민규 : 수고하셨습니다 :)
		int y;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		sc.close();
		return y;
	}
	public static void result(int b) {
		int r;
		if(b%4==0) {
			if(b%400==0) r=1;
			else if(b%100==0) r=0;
			else r=1;
		}
		else r=0;
		System.out.print(r);
	}

	
	public static void main(String[] args) {
		
	result(input());
	
	}
	
}