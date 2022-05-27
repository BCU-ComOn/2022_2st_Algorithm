import java.util.Scanner; // 기금 : 고생하셨습니다!

public class bj5613_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input_num = 0;
		String input_sign = "";
		int tot = 0;
		
		
		tot = sc.nextInt();
		
		
		while(true) {
			
			input_sign = sc.next();
			sc.nextLine();
			
			if(input_sign.equals("=")) {
				break;
			}
			
			input_num = sc.nextInt();
			
			
			if(input_sign.equals("+")) {
				tot += input_num;
			}
			else if(input_sign.equals("-")) {
				tot -= input_num;
			}
			else if(input_sign.equals("*")) {
				tot *= input_num;
			}
			else if(input_sign.equals("/")) {
				if(input_num < 0) {
					continue;
				}
				else {
					tot /= input_num;
				}
			}
			
		}
		sc.close();
		
		System.out.println(tot);
		

	}

}
