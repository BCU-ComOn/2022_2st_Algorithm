
import java.util.Scanner;
public class bj2884_lsj_java {
	public static int[] cal(int[] time) {
		int hour=time[0];
		int min=time[1];
		for(int target_time=45;target_time>0;target_time--) {
			if(min<1) {
				min=59;
				if(hour<1) {
					hour=23;
				}else {
					hour--;
				}
			}else {
				min--;
			}
		}
		int[] result= {hour,min};
		return result;
	}
	public static boolean validation_check(int[] value) {
		int hour=value[0];
		int min=value[1];
		if((hour<0 || hour>23)||(min<0||min>59)) {
			return false;
		}
		return true;
	}
	public static int[] input() {
		Scanner input= new Scanner(System.in);
		String input_str=input.nextLine();
		String[] split_str=input_str.split(" ");
		int[] value= {Integer.parseInt(split_str[0]),Integer.parseInt(split_str[1])};
		input.close()
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value=input();
		if(validation_check(value)) {
			int[] changed_value=cal(value);
			System.out.printf("%d %d",changed_value[0],changed_value[1]);
		}
	}
}