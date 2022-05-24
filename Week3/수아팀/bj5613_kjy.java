package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
		// 초기값 입력 받고 저장
        int result = in.nextInt();
        
        
        Loop :
        while (true) {
			// +, -, *, / 을 c에 입력 
        	String c = in.next();
        	
			// switch 문으로 판별
        	switch (c) {
        	case "+" : result += in.nextInt(); break;
        	case "-" : result -= in.nextInt(); break;
        	case "*" : result *= in.nextInt(); break;
        	case "/" : result /= in.nextInt(); break;

			// c가 "=" 일때 결과값 출력
        	case "=" : System.out.println(result); break Loop;
        	}
        }
    }
    
}
