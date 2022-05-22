import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		
		int sum = in.nextInt();
		
		M += sum;
		H += M/60;
		M %= 60;
		H %= 24;
		
		System.out.println(H+" "+M); 
	}

}
// 수아 : 멋진 코드네요 !