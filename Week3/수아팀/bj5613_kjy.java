package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int result = in.nextInt();
        
        
        Loop :
        while (true) {
        	String c = in.next();
        	
        	switch (c) {
        	case "+" : result += in.nextInt(); break;
        	case "-" : result -= in.nextInt(); break;
        	case "*" : result *= in.nextInt(); break;
        	case "/" : result /= in.nextInt(); break;
        	case "=" : System.out.println(result); break Loop;
        	}
        }
    }
    
}
