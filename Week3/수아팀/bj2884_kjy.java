package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int hour = in.nextInt();
        int min = in.nextInt();
        
        // 45분 이상
        if (min >= 45) {
        	min -= 45;
        }
        // 0시 일때
        else if (hour == 0) {
    		hour = 23;
    		min += 15;
    	}
        // 0 시가 아니면서 45분 미만일때
    	else {
    		hour --;
    		min += 15;
    	}
        
        
        System.out.println(hour + " " + min);
    
    }
    
}
//수임 : 이런 방법도 있군요! 수고하셨어용!
//수아 : 자바로는 이렇게 표현할 수 있네요!