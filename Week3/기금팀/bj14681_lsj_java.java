
import java.util.Scanner; //기금 : 고생하셨습니다!
public class bj14681_lsj_java {
	public static int[] input() {
		Scanner input = new Scanner(System.in);
		int[] val = {input.nextInt(),input.nextInt()};
		input.close();
		return val;
	}
	public static int quadrant_find(int x,int y) {
		if(y>0) {
			if(x>0)return 1;
			return 2;
		}if(x<0)return 3;
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=input();
		System.out.println(quadrant_find(val[0],val[1]));
	}

}
