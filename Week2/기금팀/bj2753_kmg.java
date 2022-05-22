import java.util.Scanner;

public class bj2753_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int leap_year = 0;
		int input_year = sc.nextInt();
		
		sc.close();
		
		
		if(input_year % 4 == 0) {
			if(input_year % 100 == 0) {
				if(input_year % 400 == 0) {
					// 4의 배수이고 100의 배수이고 400의 배수
					leap_year = 1;
				}
				else {
					// 4의 배수이고 100의 배수지만, 400의 배수는 아님
					leap_year = 0;
				}
				
			}
			else {
				// 4의 배수이지만 100의 배수는 아님
				leap_year = 1;
			}
			
		}
		
		System.out.println(leap_year);

	}

}
