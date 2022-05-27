import java.util.Scanner;

public class Bj2884_Gigom {
	
	public static void main(String[] args) {
		int [] t = new int[2];
		Scanner sc = new Scanner(System.in);
		t[0] = sc.nextInt();
		t[1] = sc.nextInt();
		sc.close();
		
		if(t[1]<45) {
			if(t[0]==0) {
				t[0] = 23;
				t[1] = t[1] - 45 + 60;
				System.out.println(t[0] + " " + t[1]);
			} else {
				t[0]--;
				t[1] = t[1] - 45 + 60;
				System.out.println(t[0] + " " + t[1]);
			}
		} else {
			System.out.println(t[0] + " " + (t[1]-45));
		}
		
	}

}
