package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int hour = in.nextInt();
        int min = in.nextInt();
        
        if (min >= 45) {
        	min -= 45;
        }
        else if (hour == 0) {
    		hour = 23;
    		min += 15;
    	}
    	else {
    		hour --;
    		min += 15;
    	}
        
        
        System.out.println(hour + " " + min);
    
    }
    
}
