package ComonW6;
import java.util.Scanner;

public class Bj2525_Gigom {

	public static void main(String[] args) {
		int[] t = new int[2]; //ũ�Ⱑ 2�� �迭 t�� ����
		Scanner sc = new Scanner(System.in);
		t[0] = sc.nextInt();
		t[1] = sc.nextInt() + sc.nextInt();
		sc.close();
		//t[0] = �� t[1] = ��
		while(t[1]>59) { //���� 59�� �Ѿ�ԵǸ��� �ð��� 1�� �������� ���� 60�� ������ �ȴ�.
			t[0]++;
			t[1]-= 60;
		}
		while (t[0]>23) //�� �а� ���� �ð��� 23�� �Ѿ�ԵǸ��� �ð��� 24�� ������ �ȴ�.
			t[0]-= 24;
		System.out.println(t[0] + " " + t[1]);
	}
}