import java.util.Scanner;

public class bj1297_kmg {

    // 기금님이 올리신 코드 참고해서 작성했습니다 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();	// 대각선 길이
		int h = sc.nextInt(); 	// 비율 
		int w = sc.nextInt();	// 너비 비율
		
		sc.close();
		
		double result = Math.pow(d, 2)/(Math.pow(w, 2)+Math.pow(h, 2));
		System.out.println((int)Math.sqrt(result * Math.pow(h, 2)) + " " + (int)Math.sqrt(result * Math.pow(w, 2)));
		
		

	}

}
