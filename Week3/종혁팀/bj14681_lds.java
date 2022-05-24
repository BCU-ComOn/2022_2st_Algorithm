import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj14681_lds {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		if(A != 0 && B != 0) {
			if(A >= 1 && B >= 1) {
				System.out.println("1");
			}
			if(A <= -1 && B >= 1) {
				System.out.println("2");
			}
			if(A <= -1 && B <= -1) {
				System.out.println("3");
			}
			if(A >= 1 && B <= -1) {
				System.out.println("4");
			}
		}
	}

}
