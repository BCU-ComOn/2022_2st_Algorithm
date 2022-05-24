import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1 = in.nextInt();
		while(true) {
			String a = in.next();
			if (a.equals("=")) {
				break;
			} 
			int n2 = in.nextInt();
			
			if(a.equals("+")) {
				n1+=n2;
			}
			else if(a.equals("-")) {
				n1-=n2;
			}
			else if(a.equals("*")) {
				n1*=n2;
			}
			else {
				n1/=n2;
			}
		}
		System.out.println(n1);
	}
}
