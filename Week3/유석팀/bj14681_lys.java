import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>1){
            if(y>1)
                System.out.println("1");
            else
                System.out.println("4");
        }
        else{
            if(y>1)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
}