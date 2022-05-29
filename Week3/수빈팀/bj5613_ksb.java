import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 계산기 프로그램
	         Scanner in =new Scanner(System.in);
	         int a = in.nextInt(); 
	         int num = a;
	    
	         outline: while(true) {
	            
	                 String temp = in.next(); 
	                 if(temp.contentEquals("=")) {
	                     break outline; 
	                 }
	                 int b = in.nextInt(); 
	                
	                 if(temp.contentEquals("/")){num = num/b;} 
	                 if(temp.contentEquals("+")){num = num+b;} 
	                 if(temp.contentEquals("-")){num = num-b;} 
	                 if(temp.contentEquals("*")){num = num*b;} 
	                     
	                 }
	             
	            System.out.println(num);
	}

}