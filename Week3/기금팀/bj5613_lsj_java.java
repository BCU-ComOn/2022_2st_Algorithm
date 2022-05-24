package day3;
import java.util.Scanner;
public class bj5613_lsj_java {
	public static Scanner input = new Scanner(System.in);
	public static int int_input() {
		int val = input.nextInt();
		return val;
	}
	public static String opr_input() {
		String str = input.next();
		return str;
	}
	public static int calculator() {
		int summary=int_input();
		while(true) {
			String opr=opr_input();
			if(opr.equals("="))return summary;
			int val=int_input();
			switch(opr) {
			case "+":
				summary+=val;
				break;
			case "-":
				summary-=val;
				break;
			case "*":
				summary*=val;
				break;
			case "/":
				summary/=val;
				break;	
			default:
				System.out.println("잘못된 연산자입니다. +,-,*,/ 의 연산자만 이용하실 수 있습니다.");
			}
		}
	}
	public static void main(String[] args) {
		int val=calculator();
		input.close();
		System.out.println(val);
	}

}
