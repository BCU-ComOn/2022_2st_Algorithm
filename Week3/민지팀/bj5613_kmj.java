package week03_22;

import java.util.Scanner;

public class bj5613_kmj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt(); 
		int result = num1; 
		while(true) {  
			String op = in.next(); 
			if(op.equals("=")) { 
				break; 
			}
			int num2 = in.nextInt(); 
			if(op.equals("+")) { 
				result += num2; 
			}
			else if(op.equals("-")) { 
				result -= num2; 
			}
			else if(op.equals("*")) { 
				result *= num2; 
			}
			else if(op.equals("/")) { 
				result /= num2; 
			}
		}
		System.out.println(result);
	} 
	

	}


