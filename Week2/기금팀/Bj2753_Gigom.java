package ComonW6;
import java.util.Scanner;
/*
 ���� ���� 
 1.1 4�� ����� ��� 0
 
 	 2.1 4�� ����̸鼭 400�� ����ϰ�� 0
 	 2.2 4�ǹ���̸鼭 100�� ����� ��� 0
 	 2.3 else
 	 
 1.2 else
*/
public class Bj2753_Gigom {
	public static int input() {
		int y;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		sc.close();
		return y;
	}
	public static void result(int b) {
		int r;
		if(b%4==0) {
			if(b%400==0) r=1;
			else if(b%100==0) r=0;
			else r=1;
		}
		else r=0;
		System.out.print(r);
	}

	
	public static void main(String[] args) {
		
	result(input());
	
	}
	
}