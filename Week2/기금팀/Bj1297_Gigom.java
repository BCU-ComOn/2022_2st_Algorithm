package ComonW6;
import java.util.Scanner;

public class Bj1297_Gigom {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int D = sc.nextInt(); //�밢������
		int H = sc.nextInt(); //����
		int W = sc.nextInt(); //�ʺ�
		sc.close();
		/*��Ÿ����� ���� 
		a = ���� b = �ʺ� c = �밢���� ����
		c^2 = a^2 + b^2
		*/
		double R = Math.pow(D,2)/(Math.pow(W,2)+Math.pow(H, 2));
		System.out.print((int)Math.sqrt(R * Math.pow(H,2)) + " " + (int)Math.sqrt(R * Math.pow(W, 2)));
		//Math.sqrt(x) ==> �Ű������� x�� ������ �־��� X�� ��Ʈ�� ����� �� ���� ��ȯ�Ѵ�. ���� x�� �����Ͻ� NaN��ȯ
		//�Ҽ������� ������ ������ integerŸ������ ����ȯ�Ͽ� ����Ѵ�.
	}

}
