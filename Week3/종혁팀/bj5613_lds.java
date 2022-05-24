import java.util.Scanner;

public class bj5613_lds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, result;
		String c;
		
		a = in.nextInt();
		result = a;
		
		while(true) {
			c = in.next();
			
			if(c.equals("=")) { System.out.println(result); break; }

			b = in.nextInt();

			if(c.equals("+")) { result += b; }
			if(c.equals("-")) { result -= b; }
			if(c.equals("*")) { result *= b; }
			if(c.equals("/")) { result /= b; }

			
		}
		
	}

}