package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        
		// x가 양수이면서
        if ( x > 0) {
			// y가 양수일때
        	if (y > 0) {
        		System.out.println("1");
        	}
			// y가 음수일때
        	else {
        		System.out.println("4");
        	}
        }
		// x가 음수이면서
        else {
			// y가 양수일때
        	if (y > 0) {
        		System.out.println("2");
        	}
			// y가 음수일때
        	else {
        		System.out.println("3");
        	}
        }
    
    }
    
}
//수임 : 저랑 비슷하네요!
//수아: 오..좋네요~