
import java.util.Scanner; //기금 : 고생하셨습니다!
public class bj3046_lsj_java {
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] result= {input.nextInt(),input.nextInt()};
		input.close
		return result;
	}
	public static int find_R2(int[] val) {
		int result=val[1]*2-val[0];
		return result;
	}
	public static boolean validation_check(int[] val) {
		int a=val[0];
		int b=val[1];
		if((a>1000||a<-1000)||(b>1000||b<-1000)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_val=input();
		if(validation_check(input_val)) {
			int result=find_R2(input_val);
			System.out.println(result);
		}
	}
}